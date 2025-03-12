package net.cstjean.testmod.item.armor;

import net.cstjean.testmod.item.MiningHelmetRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class HelmetTestArmorItem extends ArmorItem implements GeoItem {
    private static final RawAnimation ACTIVATE_ANIM = RawAnimation.begin().thenPlay("use.activate");
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public HelmetTestArmorItem(Holder<ArmorMaterial> pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "Activation", 0, state -> PlayState.STOP)
                .triggerableAnim("activate", ACTIVATE_ANIM));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private GeoArmorRenderer<?> renderer;

            public <T extends LivingEntity> HumanoidModel<?> getGeoArmorRenderer(@Nullable T livingEntity, ItemStack itemStack, @Nullable EquipmentSlot equipmentSlot, @Nullable HumanoidModel<T> original) {
                if(this.renderer == null) // Important that we do this. If we just instantiate  it directly in the field it can cause incompatibilities with some mods.
                    this.renderer = new MiningHelmetRenderer();

                return this.renderer;
            }
        });
    }

//    private AnimationFactory factory = new AnimationFactory(this);
//
//    private static final Map<ArmorMaterial, MobEffectInstance> MATERIAL_TO_EFFECT_MAP =
//            (new ImmutableMap.Builder<ArmorMaterial, MobEffectInstance>())
//                    .put(ModArmorMaterials.MINING_HELMET_MATERIAL.get(), new MobEffectInstance(MobEffects.LUCK, 200, 1)).build();
//
//    public HelmetTestArmorItem(ArmorMaterial material, EquipmentSlot slot, Properties settings) {
//        super(material, slot, settings);
//    }
//
//    @Override
//    public void registerControllers(AnimationData data) {
//        data.addAnimationController(new AnimationController<HelmetTestArmorItem>(this, "controller",
//                20, this::predicate));
//    }
//
//    @Override
//    public AnimationFactory getFactory() {
//        return this.factory;
//    }
//
//    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
//        event.getController().setAnimation(new AnimationBuilder().addAnimation("idle", true));
//        return PlayState.CONTINUE;
//    }
//
////    @Override
////    public void onArmorTick(ItemStack stack, Level world, Player player) {
////        if(!world.isClientSide()) {
////            if(hasFullSuitOfArmorOn(player)) {
////                evaluateArmorEffects(player);
////            }
////        }
////    }
//
//    private void evaluateArmorEffects(Player player) {
//        for (Map.Entry<ArmorMaterial, MobEffectInstance> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
//            ArmorMaterial mapArmorMaterial = entry.getKey();
//            MobEffectInstance mapStatusEffect = entry.getValue();
//
//            if(hasCorrectArmorOn(mapArmorMaterial, player)) {
//                addStatusEffectForMaterial(player, mapArmorMaterial, mapStatusEffect);
//            }
//        }
//    }
//
//    private void addStatusEffectForMaterial(Player player, ArmorMaterial mapArmorMaterial,
//                                            MobEffectInstance mapStatusEffect) {
//        boolean hasPlayerEffect = player.hasEffect(mapStatusEffect.getEffect());
//
//        if(hasCorrectArmorOn(mapArmorMaterial, player) && !hasPlayerEffect) {
//            player.addEffect(new MobEffectInstance(mapStatusEffect.getEffect(),
//                    mapStatusEffect.getDuration(), mapStatusEffect.getAmplifier()));
//
//            //if(new Random().nextFloat() > 0.6f) { // 40% of damaging the armor! Possibly!
//            //    player.getInventory().hurtArmor(DamageSource.MAGIC, 1f, new int[]{0, 1, 2, 3});
//            //}
//        }
//    }
//
//    private boolean hasFullSuitOfArmorOn(Player player) {
//        ItemStack boots = player.getInventory().getArmor(0);
//        ItemStack leggings = player.getInventory().getArmor(1);
//        ItemStack breastplate = player.getInventory().getArmor(2);
//        ItemStack helmet = player.getInventory().getArmor(3);
//
//        return !helmet.isEmpty() && !breastplate.isEmpty()
//                && !leggings.isEmpty() && !boots.isEmpty();
//    }
//
//    private boolean hasCorrectArmorOn(ArmorMaterial material, Player player) {
//        for (ItemStack armorStack: player.getInventory().armor) {
//            if(!(armorStack.getItem() instanceof ArmorItem)) {
//                return false;
//            }
//        }
//
//        ArmorItem boots = ((ArmorItem)player.getInventory().getArmor(0).getItem());
//        ArmorItem leggings = ((ArmorItem)player.getInventory().getArmor(1).getItem());
//        ArmorItem breastplate = ((ArmorItem)player.getInventory().getArmor(2).getItem());
//        ArmorItem helmet = ((ArmorItem)player.getInventory().getArmor(3).getItem());
//
//        return helmet.getMaterial().get() == material && breastplate.getMaterial().get() == material &&
//                leggings.getMaterial().get() == material && boots.getMaterial().get() == material;
//    }
}
