package net.cstjean.testmod.item;

import net.cstjean.testmod.TestMod;
import net.cstjean.testmod.item.armor.HelmetTestArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class MiningHelmetModel extends GeoModel<HelmetTestArmorItem> {
    @Override
    public ResourceLocation getModelResource(HelmetTestArmorItem animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "geo/mining_helmet_skin.geo.json");

    }

    @Override
    public ResourceLocation getTextureResource(HelmetTestArmorItem animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "textures/models/armor/mining_helmet_skin.png");
    }

    @Override
    public ResourceLocation getAnimationResource(HelmetTestArmorItem animatable) {
        return new ResourceLocation(TestMod.MOD_ID, "animations/armor_animation.json");
    }
}