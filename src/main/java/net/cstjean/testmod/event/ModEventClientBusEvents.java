//package net.cstjean.testmod.event;
//
//import net.cstjean.testmod.TestMod;
//import net.cstjean.testmod.item.armor.HelmetTestArmorItem;
//import net.cstjean.testmod.item.MiningHelmetRenderer;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.client.event.EntityRenderersEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;
//
//@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//public class ModEventClientBusEvents {
//    @SubscribeEvent
//    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
//        GeoArmorRenderer.registerArmorRenderer(HelmetTestArmorItem.class, new MiningHelmetRenderer());
//    }
//}