package com.dgiim.dgiimcraft.core.item;

import com.dgiim.dgiimcraft.DgiimCraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by jmml on 27/6/17.
 */
public class ItemBlockDgiim extends ItemBlock {

    public ItemBlockDgiim(Block block) {
        super(block);

    }

    public static void setItemName(final Item item, final String itemName) {
        item.setRegistryName(DgiimCraft.MODID, itemName);
        item.setUnlocalizedName(item.getRegistryName().toString());
    }
}
