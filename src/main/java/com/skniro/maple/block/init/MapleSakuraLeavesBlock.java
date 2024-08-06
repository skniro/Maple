package com.skniro.maple.block.init;

import com.skniro.maple.particle.MapleParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class MapleSakuraLeavesBlock extends LeavesBlock {
    public MapleSakuraLeavesBlock(Properties settings) {
        super(settings);
    }

    public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource random) {
        super.animateTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            BlockPos blockPos = pos.below();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFull(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                spawnParticle(world, pos, random, MapleParticleTypes.SAKURA_LEAVES.get());
            }
        }
    }

    public static void spawnParticle(Level world, BlockPos pos, RandomSource random, @NotNull SimpleParticleType effect) {
        double d = (double)pos.getX() + random.nextDouble();
        double e = (double)pos.getY() - 0.05D;
        double f = (double)pos.getZ() + random.nextDouble();
        world.addParticle(effect, d, e, f, 0.0D, 0.0D, 0.0D);
    }
}
