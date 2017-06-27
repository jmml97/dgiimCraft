package com.dgiim.dgiimcraft.tab;

import com.dgiim.dgiimcraft.core.item.ModItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by jmml on 27/6/17.
 */

// Pestaña de nuestro mod en el modo creativo
public class CreativeTabMain extends CreativeTabs {

    public CreativeTabMain(int index, String label) {
        super(index, label);
    }

    // Objeto que se mostrará en la pestaña
    // TODO: que sea un mango
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItemHandler.mangoItem);
    }
}
