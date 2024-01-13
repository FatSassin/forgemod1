package net.fatsassin.depthcraft.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MORSEL = new FoodProperties.Builder().nutrition(2).meat()
            .saturationMod(0.2f).effect(() ->
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 1200), 0.5f).build();
}
