package net.fatsassin.depthcraft.item;

import net.fatsassin.depthcraft.Depthcraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Depthcraft.MOD_ID);

    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_PEARL = ITEMS.register("red_pearl",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PETROCK = ITEMS.register("petrock",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
