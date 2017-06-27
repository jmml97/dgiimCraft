package com.dgiim.dgiimcraft.item;

import com.dgiim.dgiimcraft.DgiimCraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

/**
 * Created by jmml on 27/6/17.
 */
public class ItemDgiimFood extends ItemFood {
    public ItemDgiimFood(int amount, float saturation, boolean isWolfFood, String itemName) {
        super(amount, saturation, isWolfFood);
        setItemName(this, itemName);
        setCreativeTab(DgiimCraft.tabMain);
    }

    public static void setItemName(final Item item, final String itemName) {
        item.setRegistryName(DgiimCraft.MODID, itemName);
        item.setUnlocalizedName(item.getRegistryName().toString());
    }
}
