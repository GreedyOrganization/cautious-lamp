
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.paultheskeletonking.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.paultheskeletonking.block.TheForgottenKingdomPortalBlock;
import net.mcreator.paultheskeletonking.PaultheskeletonkingMod;

public class PaultheskeletonkingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PaultheskeletonkingMod.MODID);
	public static final RegistryObject<Block> THE_FORGOTTEN_KINGDOM_PORTAL = REGISTRY.register("the_forgotten_kingdom_portal", () -> new TheForgottenKingdomPortalBlock());
}
