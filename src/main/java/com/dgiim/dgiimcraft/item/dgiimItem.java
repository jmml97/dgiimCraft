package com.dgiim.dgiimcraft.item;

import com.dgiim.dgiimcraft.DgiimCraft;
import net.minecraft.item.Item;

/**
 * Created by jmml on 27/6/17.
 */
public class dgiimItem extends Item {

    public dgiimItem(final String itemName) {

        setItemName(this, itemName);
        setCreativeTab(DgiimCraft.tabMain);

    }

    public static void setItemName(final Item item, final String itemName) {
        item.setRegistryName(DgiimCraft.MODID, itemName);
        item.setUnlocalizedName(item.getRegistryName().toString());
    }
}
