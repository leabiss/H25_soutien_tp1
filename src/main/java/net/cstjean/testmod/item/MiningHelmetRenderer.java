package net.cstjean.testmod.item;

import net.cstjean.testmod.item.armor.HelmetTestArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MiningHelmetRenderer extends GeoArmorRenderer<HelmetTestArmorItem> {
    public MiningHelmetRenderer() {
        super(new MiningHelmetModel());

        this.head = new MiningHelmetModel().getBone("armorHead").get();
    }
}
