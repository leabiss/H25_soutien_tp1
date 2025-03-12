package net.cstjean.testmod.item;

import net.cstjean.testmod.item.custom.ChiselItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.cstjean.testmod.TestMod;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Makes sure the item is in the game
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    // Adds the barebone item (not really in the game, but the game knows about it)
    public static final RegistryObject<Item> RUBBER_DUCK = ITEMS.register("rubber_duck",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLUE_RUBBER_DUCK = ITEMS.register("blue_rubber_duck",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> ALEXANDRITE_HELMET = ITEMS.register("alexandrite_helmet",
                () -> new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                        new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

//    public static final RegistryObject<Item> MINING_HELMET = ITEMS.register("mining_helmet",
//            () -> new ArmorItem(ModArmorMaterials.ALEXANDRITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
//                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

    public static final RegistryObject<Item> MINING_HELMET = ITEMS.register("mining_helmet",
            () -> new ArmorItem(ModArmorMaterials.MINING_HELMET_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
