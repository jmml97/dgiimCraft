package com.dgiim.dgiimcraft;

import com.dgiim.dgiimcraft.proxy.CommonProxy;
import com.dgiim.dgiimcraft.tab.CreativeTabMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DgiimCraft.MODID, version = DgiimCraft.VERSION, name = DgiimCraft.NAME)
public class DgiimCraft {
    public static final String MODID = "dgiimcraft";
    public static final String VERSION = "0.0.1";
    public static final String NAME = "dgiimCraft";

    @Mod.Instance
    public static DgiimCraft instance;

    public static CreativeTabMain tabMain;

    @SidedProxy(clientSide = "com.dgiim.dgiimcraft.proxy.ClientProxy", serverSide ="com.dgiim.dgiimcraft.proxy.CommonProxy")
    public static CommonProxy proxy;

    public DgiimCraft() {
        //MinecraftForge.EVENT_BUS.register(new RegisteringHandler());
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        tabMain = new CreativeTabMain(CreativeTabs.getNextID(), "dgiimCraft");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
