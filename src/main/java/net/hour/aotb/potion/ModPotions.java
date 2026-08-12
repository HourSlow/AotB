package net.hour.aotb.potion;

import net.hour.aotb.AllOfTheAbove;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final RegistryEntry<Potion> GLOWING_POTION = registerPotion("glowing_potion",
            new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 1800, 0)));

    public static final RegistryEntry<Potion> GLOWING_POTION_2 = registerPotion("glowing_potion_2",
            new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 3600, 0)));

    public static final RegistryEntry<Potion> UNLUCK_POTION = registerPotion("unluck_potion",
            new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 6000, 0)));



    private static RegistryEntry<Potion> registerPotion(String name, Potion potion){
        return Registry.registerReference(Registries.POTION, Identifier.of(AllOfTheAbove.MOD_ID, name), potion);
    }

    public static void registerPotions(){}
}
