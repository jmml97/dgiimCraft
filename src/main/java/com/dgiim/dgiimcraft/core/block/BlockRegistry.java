package com.dgiim.dgiimcraft.core.block;

import com.dgiim.dgiimcraft.DgiimCraft;
import com.dgiim.dgiimcraft.arboriculture.block.BlockTest;
import com.dgiim.dgiimcraft.arboriculture.item.ItemBlockTest;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

/**
 * Created by jmml on 27/6/17.
 */
@GameRegistry.ObjectHolder(DgiimCraft.MODID)
public class BlockRegistry {

    // Arboriculture
    public static final Block testBlock = new BlockTest();


    // Clase que se encarga de registrar los bloques
    @Mod.EventBusSubscriber
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            final IForgeRegistry<Block> registry = event.getRegistry();

            registry.register(testBlock);
        }
    }
}
