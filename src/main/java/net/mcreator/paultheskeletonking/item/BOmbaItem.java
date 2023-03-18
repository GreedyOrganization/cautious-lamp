
package net.mcreator.paultheskeletonking.item;

import net.minecraft.network.chat.Component;

public class BOmbaItem extends RecordItem {

	public BOmbaItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.loop")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 100);
	}

}
