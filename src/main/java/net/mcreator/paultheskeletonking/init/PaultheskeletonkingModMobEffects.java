
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paultheskeletonking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.paultheskeletonking.potion.SzMobEffect;
import net.mcreator.paultheskeletonking.PaultheskeletonkingMod;

public class PaultheskeletonkingModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PaultheskeletonkingMod.MODID);
	public static final RegistryObject<MobEffect> SZ = REGISTRY.register("sz", () -> new SzMobEffect());
}
