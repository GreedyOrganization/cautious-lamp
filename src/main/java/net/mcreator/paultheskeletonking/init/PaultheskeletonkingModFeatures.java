
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paultheskeletonking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.paultheskeletonking.world.features.plants.FlowersFeature;
import net.mcreator.paultheskeletonking.PaultheskeletonkingMod;

@Mod.EventBusSubscriber
public class PaultheskeletonkingModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, PaultheskeletonkingMod.MODID);
	public static final RegistryObject<Feature<?>> FLOWERS = REGISTRY.register("flowers", FlowersFeature::feature);
}
