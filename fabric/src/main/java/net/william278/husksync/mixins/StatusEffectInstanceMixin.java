package net.william278.husksync.mixins;

import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(StatusEffectInstance.class)
public interface StatusEffectInstanceMixin {

    @Accessor
    StatusEffectInstance getHiddenEffect();
}
