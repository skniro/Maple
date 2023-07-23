package com.skniro.maple.block.entity;

import com.mojang.logging.LogUtils;
import com.skniro.maple.block.init.ChiseledBookshelfBlock;
import com.skniro.maple.tag.MapleItemTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.slf4j.Logger;

import java.util.Objects;
import java.util.function.Predicate;

public class ChiseledBookshelfBlockEntity extends BlockEntity implements Inventory {
    public static final int MAX_BOOKS = 6;
    private static final Logger LOGGER = LogUtils.getLogger();
    private final DefaultedList<ItemStack> inventory;
    private int lastInteractedSlot;

    public ChiseledBookshelfBlockEntity(BlockPos pos, BlockState state) {
        super(MapleBlockEntityType.CHISELED_BOOKSHELF, pos, state);
        this.inventory = DefaultedList.ofSize(6, ItemStack.EMPTY);
        this.lastInteractedSlot = -1;
    }

    private void updateState(int interactedSlot) {
        if (interactedSlot >= 0 && interactedSlot < 6) {
            this.lastInteractedSlot = interactedSlot;
            BlockState blockState = this.getCachedState();

            for(int i = 0; i < ChiseledBookshelfBlock.SLOT_OCCUPIED_PROPERTIES.size(); ++i) {
                boolean bl = !this.getStack(i).isEmpty();
                BooleanProperty booleanProperty = (BooleanProperty)ChiseledBookshelfBlock.SLOT_OCCUPIED_PROPERTIES.get(i);
                blockState = (BlockState)blockState.with(booleanProperty, bl);
            }

            ((World) Objects.requireNonNull(this.world)).setBlockState(this.pos, blockState, 3);
        } else {
            LOGGER.error("Expected slot 0-5, got {}", interactedSlot);
        }
    }

    public void readNbt(NbtCompound nbt) {
        this.inventory.clear();
        Inventories.readNbt(nbt, this.inventory);
        this.lastInteractedSlot = nbt.getInt("last_interacted_slot");
    }

    protected void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, this.inventory, true);
        nbt.putInt("last_interacted_slot", this.lastInteractedSlot);
    }

    public int getOpenSlotCount() {
        return (int)this.inventory.stream().filter(Predicate.not(ItemStack::isEmpty)).count();
    }

    public void clear() {
        this.inventory.clear();
    }

    public int size() {
        return 6;
    }

    public boolean isEmpty() {
        return this.inventory.stream().allMatch(ItemStack::isEmpty);
    }

    public ItemStack getStack(int slot) {
        return (ItemStack)this.inventory.get(slot);
    }

    public ItemStack removeStack(int slot, int amount) {
        ItemStack itemStack = (ItemStack)Objects.requireNonNullElse((ItemStack)this.inventory.get(slot), ItemStack.EMPTY);
        this.inventory.set(slot, ItemStack.EMPTY);
        if (!itemStack.isEmpty()) {
            this.updateState(slot);
        }

        return itemStack;
    }

    public ItemStack removeStack(int slot) {
        return this.removeStack(slot, 1);
    }

    public void setStack(int slot, ItemStack stack) {
        if (stack.isIn(MapleItemTags.BOOKSHELF_BOOKS)) {
            this.inventory.set(slot, stack);
            this.updateState(slot);
        }

    }

    public boolean canTransferTo(Inventory hopperInventory, int slot, ItemStack stack) {
        return hopperInventory.containsAny((itemStack2) -> {
            if (itemStack2.isEmpty()) {
                return true;
            } else {
                return ItemStack.canCombine(stack, itemStack2) && itemStack2.getCount() + stack.getCount() <= Math.min(itemStack2.getMaxCount(), hopperInventory.getMaxCountPerStack());
            }
        });
    }

    public int getMaxCountPerStack() {
        return 1;
    }

    public boolean canPlayerUse(PlayerEntity player) {
        return true;
    }

    public boolean isValid(int slot, ItemStack stack) {
        return stack.isIn(MapleItemTags.BOOKSHELF_BOOKS) && this.getStack(slot).isEmpty();
    }

    public int getLastInteractedSlot() {
        return this.lastInteractedSlot;
    }
}
