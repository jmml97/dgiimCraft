package com.dgiim.dgiimcraft.client.model;

import com.dgiim.dgiimcraft.core.block.BlockRegistry;
import com.dgiim.dgiimcraft.core.item.ItemRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by jmml on 27/6/17.
 * Clase que se encarga de registrar los modelos de los items
 */
@Mod.EventBusSubscriber(Side.CLIENT)
public class ModModelManager {

    public static final ModModelManager INSTANCE = new ModModelManager();

    @SubscribeEvent
    public static void registerAllModels(final ModelRegistryEvent event) {
        INSTANCE.registerArboricultureItemModels();
        INSTANCE.registerArboricultureBlockModels();
    }

    private void registerArboricultureItemModels() {
        registerItemModel(ItemRegistry.mangoItem, 0, "arboriculture");
        registerItemModel(ItemRegistry.mangoLogItemBlock, 0, "arboriculture");
    }

    private void registerArboricultureBlockModels() {
        registerBlockModel(BlockRegistry.mangoLogBlock, 0, "arboriculture");
    }

    private void registerItemModels() {

    }

    public static void registerItemModel(Item item, int metadata, String location) {

        String resourceName = item.getUnlocalizedName().substring(5).replace(":", ":" + location + "/");
        System.out.println(item.getUnlocalizedName());
        System.out.println(resourceName);

        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(resourceName, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, metadata, itemModelResourceLocation);
    }

    public static void registerBlockModel(Block block, int metadata, String location) {

        String resourceName = block.getUnlocalizedName().substring(5).replace(":", ":" + location + "/");

        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(resourceName, "inventory");
        //ModelLoader.setCustomModelResourceLocation(block, metadata, itemModelResourceLocation);


    }
}
