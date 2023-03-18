
package net.mcreator.paultheskeletonking.world.dimension;

@Mod.EventBusSubscriber
public class TheForgottenKingdomDimension {

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Fixers {

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {

				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.2, 0.2, 0.2);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}

			};
			event.enqueueWork(() -> DimensionSpecialEffects.EFFECTS.put(new ResourceLocation("paultheskeletonking:the_forgotten_kingdom"), customEffect));
		}

	}

}
