
package net.mcreator.paultheskeletonking.potion;

public class SzMobEffect extends MobEffect {

	public SzMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.paultheskeletonking.sz";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

}
