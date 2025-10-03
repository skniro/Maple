package com.skniro.maple.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.random.Random;

public class MapleCampfireSmokeParticle extends BillboardParticle {
    MapleCampfireSmokeParticle(ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, boolean signal, Sprite sprite) {
        super(world, x, y, z, sprite);
        this.scale(1.0F);
        this.setBoundingBoxSpacing(0.25F, 0.25F);
        if (signal) {
            this.maxAge = this.random.nextInt(50) + 280;
        } else {
            this.maxAge = this.random.nextInt(50) + 80;
        }

        this.gravityStrength = 3.0E-6F;
        this.velocityX = velocityX;
        this.velocityY = velocityY + (double)(this.random.nextFloat() / 500.0F);
        this.velocityZ = velocityZ;
    }

    public void tick() {
        this.lastX = this.x;
        this.lastY = this.y;
        this.lastZ = this.z;
        if (this.age++ < this.maxAge && !(this.alpha <= 0.0F)) {
            this.velocityX += (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.velocityZ += (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.velocityY -= (double)this.gravityStrength;
            this.move(this.velocityX, this.velocityY, this.velocityZ);
            if (this.age >= this.maxAge - 60 && this.alpha > 0.01F) {
                this.alpha -= 0.015F;
            }

        } else {
            this.markDead();
        }
    }

    public BillboardParticle.RenderType getRenderType() {
        return RenderType.PARTICLE_ATLAS_TRANSLUCENT;
    }

    @Environment(EnvType.CLIENT)
    public static class SignalSmokeFactory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public SignalSmokeFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i, Random random) {
            MapleCampfireSmokeParticle campfireSmokeParticle = new MapleCampfireSmokeParticle(clientWorld, d, e, f, g, h, i, true, this.spriteProvider.getSprite(random));
            campfireSmokeParticle.setAlpha(0.95F);
            return campfireSmokeParticle;
        }
    }

    @Environment(EnvType.CLIENT)
    public static class CosySmokeFactory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public CosySmokeFactory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType defaultParticleType, ClientWorld clientWorld, double d, double e, double f, double g, double h, double i, Random random) {
            MapleCampfireSmokeParticle campfireSmokeParticle = new MapleCampfireSmokeParticle(clientWorld, d, e, f, g, h, i, false, this.spriteProvider.getSprite(random));
            campfireSmokeParticle.setAlpha(0.7F);
            return campfireSmokeParticle;
        }
    }
}