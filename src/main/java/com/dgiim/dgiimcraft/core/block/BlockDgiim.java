package com.dgiim.dgiimcraft.core.block;

import com.dgiim.dgiimcraft.DgiimCraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

/**
 * Created by jmml on 27/6/17.
 */
public class BlockDgiim extends Block {

    public BlockDgiim(Material materialIn, final String blockName) {
        super(materialIn);

        setBlockName(this, blockName);
        setCreativeTab(DgiimCraft.tabMain);
    }

    public static void setBlockName(final Block block, final String blockName) {
        block.setRegistryName(DgiimCraft.MODID, blockName);
        block.setUnlocalizedName(block.getRegistryName().toString());
    }

}
