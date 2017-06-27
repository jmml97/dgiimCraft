package com.dgiim.dgiimcraft.client.model;

import com.dgiim.dgiimcraft.core.item.ModItemHandler;
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
        INSTANCE.registerItemModels();
    }

    private void registerItemModels() {
        registerModel(ModItemHandler.mangoItem, 0);
    }

    public static void registerModel(Item item, int metadata) {

        String resourceName = item.getUnlocalizedName().substring(5).replace('.', ':');

        ModelResourceLocation itemModelResourceLocation = new ModelResourceLocation(resourceName, "inventory");
        ModelLoader.setCustomModelResourceLocation(item, 0, itemModelResourceLocation);
    }
}
