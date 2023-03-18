
package net.mcreator.paultheskeletonking.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;

public class ForgottenLandsBiome {

	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(0.0f), Climate.Parameter.span(-1f, 1f),
					0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.span(0.3f, 1f), Climate.Parameter.span(-0.5f, 0.5f), Climate.Parameter.point(1.0f), Climate.Parameter.span(-1f, 1f),
					0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-3355444).waterColor(4159204).waterFogColor(329011).skyColor(-3355444).foliageColorOverride(10387789).grassColorOverride(9470285).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings
				.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
						PlacementUtils
								.register("paultheskeletonking:tree_forgotten_lands",
										FeatureUtils.register("paultheskeletonking:tree_forgotten_lands", Feature.TREE,
												new TreeConfiguration.TreeConfigurationBuilder(BlockStateProvider.simple(Blocks.DARK_OAK_LOG.defaultBlockState()), new ForkingTrunkPlacer(7, 2, 2),
														BlockStateProvider.simple(Blocks.AIR.defaultBlockState()), new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)), new TwoLayersFeatureSize(1, 0, 2))
														.decorators(ImmutableList.of(ForgottenLandsLeaveDecorator.INSTANCE, ForgottenLandsTrunkDecorator.INSTANCE

																, ForgottenLandsFruitDecorator.INSTANCE))
														.build()),
										List.of(CountPlacement.of(1), InSquarePlacement.spread(), SurfaceWaterDepthFilter.forMaxDepth(0), PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, PlacementUtils.filteredByBlockSurvival(Blocks.OAK_SAPLING),
												BiomeFilter.biome())));

		BiomeDefaultFeatures.addDesertVegetation(biomeGenerationSettings);

		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 20, 1, 2));

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.5f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}

}
