package com.skniro.maple.item.init.tool;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.item.*;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.GameEvent.Context;

public class MapleHoeItem extends DiggerItem {
    protected static final Map<Block, Pair<Predicate<UseOnContext>, Consumer<UseOnContext>>> TILLING_ACTIONS;

    public MapleHoeItem(Tier material, int attackDamage, float attackSpeed, Item.Properties settings) {
        super((float)attackDamage, attackSpeed, material, BlockTags.MINEABLE_WITH_HOE, settings);
    }

    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        Pair<Predicate<UseOnContext>, Consumer<UseOnContext>> pair = (Pair)TILLING_ACTIONS.get(world.getBlockState(blockPos).getBlock());
        if (pair == null) {
            return InteractionResult.PASS;
        } else {
            Predicate<UseOnContext> predicate = (Predicate)pair.getFirst();
            Consumer<UseOnContext> consumer = (Consumer)pair.getSecond();
            if (predicate.test(context)) {
                Player playerEntity = context.getPlayer();
                world.playSound(playerEntity, blockPos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!world.isClientSide) {
                    consumer.accept(context);
                    if (playerEntity != null) {
                        context.getItemInHand().hurtAndBreak(1, playerEntity, (p) -> {
                            p.broadcastBreakEvent(context.getHand());
                        });
                    }
                }

                return InteractionResult.sidedSuccess(world.isClientSide);
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    public static Consumer<UseOnContext> createTillAction(BlockState result) {
        return (context) -> {
            context.getLevel().setBlock(context.getClickedPos(), result, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), Context.of(context.getPlayer(), result));
        };
    }

    public static Consumer<UseOnContext> createTillAndDropAction(BlockState result, ItemLike droppedItem) {
        return (context) -> {
            context.getLevel().setBlock(context.getClickedPos(), result, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), Context.of(context.getPlayer(), result));
            Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(droppedItem));
        };
    }

    public static boolean canTillFarmland(UseOnContext context) {
        return context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir();
    }

    static {
        TILLING_ACTIONS = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Pair.of(net.minecraft.world.item.HoeItem::onlyIfAirAbove, createTillAction(Blocks.FARMLAND.defaultBlockState())), Blocks.DIRT_PATH, Pair.of(net.minecraft.world.item.HoeItem::onlyIfAirAbove, createTillAction(Blocks.FARMLAND.defaultBlockState())), Blocks.DIRT, Pair.of(net.minecraft.world.item.HoeItem::onlyIfAirAbove, createTillAction(Blocks.FARMLAND.defaultBlockState())), Blocks.COARSE_DIRT, Pair.of(net.minecraft.world.item.HoeItem::onlyIfAirAbove, createTillAction(Blocks.DIRT.defaultBlockState())), Blocks.ROOTED_DIRT, Pair.of((itemUsageContext) -> {
            return true;
        }, createTillAndDropAction(Blocks.DIRT.defaultBlockState(), Items.HANGING_ROOTS))));
    }
}
