package net.ceevyte.voidroot_echo.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent SAUSE_CAN = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 5, 0), 0.15f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300, 0), 0.5f)
            .build();
}
