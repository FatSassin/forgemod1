package net.fatsassin.depthcraft.datagen;

import net.fatsassin.depthcraft.Depthcraft;
import net.fatsassin.depthcraft.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Depthcraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BLADE);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.MORSEL);
        simpleItem(ModItems.PEARL);
        simpleItem(ModItems.PETROCK);
        simpleItem(ModItems.RED_PEARL);
        simpleItem(ModItems.SEA_TAR_BALL);
        simpleItem(ModItems.TWO_TRUCKS_MUSIC_DISC);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Depthcraft.MOD_ID, "item/" + item.getId().getPath()));
    }
}
