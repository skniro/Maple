package com.skniro.maple.item.init.tool;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MapleHoeItem extends DiggerItem {
    protected static final Map<Block, Pair<Predicate<UseOnContext>, Consumer<UseOnContext>>> TILLING_ACTIONS;

    public MapleHoeItem(Tier material, int attackDamage, float attackSpeed, Properties settings) {
        super((float)attackDamage, attackSpeed, material, BlockTags.MINEABLE_WITH_HOE, settings);
    }

    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState toolModifiedState = level.getBlockState(blockpos).getToolModifiedState(context, ToolActions.HOE_TILL, false);
        Pair<Predicate<UseOnContext>, Consumer<UseOnContext>> pair = toolModifiedState == null ? null : Pair.of((ctx) -> {
            return true;
        }, changeIntoState(toolModifiedState));
        if (pair == null) {
            return InteractionResult.PASS;
        } else {
            Predicate<UseOnContext> predicate = (Predicate)pair.getFirst();
            Consumer<UseOnContext> consumer = (Consumer)pair.getSecond();
            if (predicate.test(context)) {
                Player player = context.getPlayer();
                level.playSound(player, blockpos, SoundEvents.HOE_TILL, SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!level.isClientSide) {
                    consumer.accept(context);
                    if (player != null) {
                        context.getItemInHand().hurtAndBreak(1, player, (p_150845_) -> {
                            p_150845_.broadcastBreakEvent(context.getHand());
                        });
                    }
                }

                return InteractionResult.sidedSuccess(level.isClientSide);
            } else {
                return InteractionResult.PASS;
            }
        }
    }

    public static Consumer<UseOnContext> changeIntoState(BlockState result) {
        return (context) -> {
            context.getLevel().setBlock(context.getClickedPos(), result, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(context.getPlayer(), result));
        };
    }

    public static Consumer<UseOnContext> changeIntoStateAndDropItem(BlockState result, ItemLike droppedItem) {
        return (context) -> {
            context.getLevel().setBlock(context.getClickedPos(), result, 11);
            context.getLevel().gameEvent(GameEvent.BLOCK_CHANGE, context.getClickedPos(), GameEvent.Context.of(context.getPlayer(), result));
            Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(droppedItem));
        };
    }

    public static boolean onlyIfAirAbove(UseOnContext  context) {
        return context.getClickedFace() != Direction.DOWN && context.getLevel().getBlockState(context.getClickedPos().above()).isAir();
    }

    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return ToolActions.DEFAULT_HOE_ACTIONS.contains(toolAction);
    }

    static {
        TILLING_ACTIONS = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Pair.of(MapleHoeItem::onlyIfAirAbove, changeIntoState(Blocks.FARMLAND.defaultBlockState())), Blocks.DIRT_PATH, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.FARMLAND.defaultBlockState())), Blocks.DIRT, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.FARMLAND.defaultBlockState())), Blocks.COARSE_DIRT, Pair.of(HoeItem::onlyIfAirAbove, changeIntoState(Blocks.DIRT.defaultBlockState())), Blocks.ROOTED_DIRT, Pair.of((pair) -> {
            return true;
        }, changeIntoStateAndDropItem(Blocks.DIRT.defaultBlockState(), Items.HANGING_ROOTS))));
    }
}
