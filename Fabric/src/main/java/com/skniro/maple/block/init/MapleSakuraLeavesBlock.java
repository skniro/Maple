package com.skniro.maple.block.init;

import com.skniro.maple.particle.MapleParticleTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MapleSakuraLeavesBlock extends LeavesBlock {
    public MapleSakuraLeavesBlock(Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        super.randomDisplayTick(state, world, pos, random);
        if (random.nextInt(10) == 0) {
            BlockPos blockPos = pos.down();
            BlockState blockState = world.getBlockState(blockPos);
            if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
                spawnParticle(world, pos, random, MapleParticleTypes.SAKURA_LEAVES);
            }
        }
    }

    public static void spawnParticle(World world, BlockPos pos, Random random, ParticleEffect effect) {
        double d = (double)pos.getX() + random.nextDouble();
        double e = (double)pos.getY() - 0.05D;
        double f = (double)pos.getZ() + random.nextDouble();
        world.addParticle(effect, d, e, f, 0.0D, 0.0D, 0.0D);
    }
}
