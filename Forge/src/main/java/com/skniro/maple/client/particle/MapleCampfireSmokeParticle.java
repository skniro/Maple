package com.skniro.maple.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

public class MapleCampfireSmokeParticle extends SingleQuadParticle {
    MapleCampfireSmokeParticle(ClientLevel world, double x, double y, double z, double velocityX, double velocityY, double velocityZ, boolean signal, TextureAtlasSprite sprite) {
        super(world, x, y, z, sprite);
        this.scale(1.0F);
        this.setSize(0.25F, 0.25F);
        if (signal) {
            this.lifetime = this.random.nextInt(50) + 280;
        } else {
            this.lifetime = this.random.nextInt(50) + 80;
        }

        this.gravity = 3.0E-6F;
        this.xd = velocityX;
        this.yd = velocityY + (double)(this.random.nextFloat() / 500.0F);
        this.zd = velocityZ;
    }

    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.age++ < this.lifetime && !(this.alpha <= 0.0F)) {
            this.xd += (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.zd += (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.yd -= (double)this.gravity;
            this.move(this.xd, this.yd, this.zd);
            if (this.age >= this.lifetime - 60 && this.alpha > 0.01F) {
                this.alpha -= 0.015F;
            }

        } else {
            this.remove();
        }
    }

    public Layer getLayer() {
        return Layer.TRANSLUCENT;
    }

    public static class SignalSmokeFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public SignalSmokeFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType defaultParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            MapleCampfireSmokeParticle campfireSmokeParticle = new MapleCampfireSmokeParticle(clientWorld, d, e, f, g, h, i, true, this.spriteProvider.get(random));
            campfireSmokeParticle.setAlpha(0.95F);
            return campfireSmokeParticle;
        }
    }

    public static class CosySmokeFactory implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteProvider;

        public CosySmokeFactory(SpriteSet spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        public Particle createParticle(SimpleParticleType defaultParticleType, ClientLevel clientWorld, double d, double e, double f, double g, double h, double i, RandomSource random) {
            MapleCampfireSmokeParticle campfireSmokeParticle = new MapleCampfireSmokeParticle(clientWorld, d, e, f, g, h, i, false, this.spriteProvider.get(random));
            campfireSmokeParticle.setAlpha(0.7F);
            return campfireSmokeParticle;
        }
    }
}