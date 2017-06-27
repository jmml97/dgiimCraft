package com.dgiim.dgiimcraft.core.item;

import com.dgiim.dgiimcraft.DgiimCraft;
import com.dgiim.dgiimcraft.arboriculture.item.ItemMango;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by jmml on 27/6/17.
 * En esta clase se recogen todos los items y se registran
 */
@GameRegistry.ObjectHolder(DgiimCraft.MODID)
public class ItemRegistry {

    // Arboriculture
    public static final Item mangoItem = new ItemMango();


    // Clase que se encarga de registrar los items
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final IForgeRegistry<Item> registry = event.getRegistry();

            registry.register(mangoItem);
        }
    }

}
