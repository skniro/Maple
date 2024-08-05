package com.skniro.maple.particle;

import com.skniro.maple.client.particle.MapleCherryLeavesParticle;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;

import javax.annotation.Nullable;

public class MapleParticleProvider implements ParticleProvider<SimpleParticleType> {
    private final SpriteSet sprites;


    public MapleParticleProvider(SpriteSet sprites) {
        this.sprites = sprites;
    }
    // 创建粒子
    @Nullable
    @Override
    public Particle createParticle(SimpleParticleType pType, ClientLevel pLevel, double pX, double pY, double pZ, double pXSpeed, double pYSpeed, double pZSpeed) {
        MapleCherryLeavesParticle exampleParticle = new MapleCherryLeavesParticle(pLevel, pX, pY, pZ, pType.getSpeed(),pType.getColor(),pType.getDiameter());
        // 随机选择一张图片作为纹理图
        exampleParticle.pickSprite(this.sprites);
        // 返回创建好的粒子
        return exampleParticle;
    }
}
