
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paultheskeletonking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.paultheskeletonking.world.biome.ForgottenLandsBiome;
import net.mcreator.paultheskeletonking.PaultheskeletonkingMod;

public class PaultheskeletonkingModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, PaultheskeletonkingMod.MODID);
	public static final RegistryObject<Biome> FORGOTTEN_LANDS = REGISTRY.register("forgotten_lands", ForgottenLandsBiome::createBiome);
}
