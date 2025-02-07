package net.cstjean.testmod.item;

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
