package net.mcreator.paultheskeletonking.world.features.treedecorators;

public class ForgottenLandsFruitDecorator extends CocoaDecorator {

    public static final ForgottenLandsFruitDecorator INSTANCE = new ForgottenLandsFruitDecorator();

    public static com.mojang.serialization.Codec<ForgottenLandsFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;

    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("forgotten_lands_tree_fruit_decorator", tdt);
    }

    public ForgottenLandsFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
