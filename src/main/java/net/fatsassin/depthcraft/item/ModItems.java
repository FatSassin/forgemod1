package net.fatsassin.depthcraft.item;

import net.fatsassin.depthcraft.Depthcraft;
import net.fatsassin.depthcraft.item.custom.FuelItem;
import net.fatsassin.depthcraft.item.custom.MetalDetectorItem;
import net.fatsassin.depthcraft.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
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
    public static final RegistryObject<Item> BLADE = ITEMS.register("blade",
            () -> new SwordItem(Tiers.DIAMOND, 4, 2,  new Item.Properties()));
    public static final RegistryObject<Item> TWO_TRUCKS_MUSIC_DISC = ITEMS.register("two_trucks_music_disc",
            () -> new RecordItem(6, ModSounds.TWO_TRUCKS, new Item.Properties().stacksTo(1),4880 ));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> MORSEL = ITEMS.register("morsel",
            () -> new Item(new Item.Properties().food(ModFoods.MORSEL)));
    public static final RegistryObject<Item> SEA_TAR_BALL = ITEMS.register("sea_tar_ball",
            () -> new FuelItem(new Item.Properties(), 3200));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
