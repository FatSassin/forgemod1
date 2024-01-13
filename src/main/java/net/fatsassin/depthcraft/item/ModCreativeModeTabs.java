package net.fatsassin.depthcraft.item;

import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import net.fatsassin.depthcraft.Depthcraft;
import net.fatsassin.depthcraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Depthcraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DEPTH_TAB = CREATIVE_MODE_TABS.register("depth_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.PEARL.get()))
                    .title(Component.translatable("creativetab_depth_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.PEARL.get());
                        pOutput.accept(ModItems.RED_PEARL.get());
                        pOutput.accept(Items.SPAWNER);
                        pOutput.accept(ModItems.PETROCK.get());
                        pOutput.accept(ModItems.BLADE.get());
                        pOutput.accept(ModBlocks.ROCK_BLOCK.get());
                        pOutput.accept(ModBlocks.DEATH_BLOCK.get());
                        pOutput.accept(ModItems.TWO_TRUCKS_MUSIC_DISC.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModItems.MORSEL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
