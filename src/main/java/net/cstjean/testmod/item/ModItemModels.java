package net.cstjean.testmod.item;

import net.cstjean.testmod.TestMod;
import net.minecraft.client.Minecraft;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.server.packs.repository.Pack;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;

//public class ModItemModels extends ItemModelProvider {
//    public ModItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
//        super(output, TestMod.MOD_ID, existingFileHelper);
//    }
//
//    protected void registerModels() {
//        withExistingParent("mining_helmet", "test_mod_soutiem:item/mining_helmet");
//    }
//
//    public static void refisterItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
//        ModItemModels itemModelProvider = new ModItemModels(output, existingFileHelper);
//        itemModelProvider.run();
//    }
//}
