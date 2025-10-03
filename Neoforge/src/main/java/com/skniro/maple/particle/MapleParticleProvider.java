package com.skniro.maple.particle;

import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

import javax.annotation.Nullable;
import java.util.Random;

public class MapleParticleProvider implements ParticleProvider<SimpleParticleType> {
    private final SpriteSet sprites;


    public MapleParticleProvider(SpriteSet sprites) {
        this.sprites = sprites;
    }
    // 创建粒子
    @Nullable
    @Override
    public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed, RandomSource randomSource) {
        MapleCherryLeavesParticle exampleParticle = new MapleCherryLeavesParticle(pLevel, pX, pY, pZ, sprites, sprites.get(randomSource));
        //exampleParticle.pickSprite(this.sprites);
        return exampleParticle;
    }
}
