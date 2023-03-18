
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paultheskeletonking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.paultheskeletonking.item.TheForgottenKingdomItem;
import net.mcreator.paultheskeletonking.PaultheskeletonkingMod;

public class PaultheskeletonkingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, PaultheskeletonkingMod.MODID);
	public static final RegistryObject<Item> THE_FORGOTTEN_KINGDOM = REGISTRY.register("the_forgotten_kingdom", () -> new TheForgottenKingdomItem());
}
