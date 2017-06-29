package com.dgiim.dgiimcraft.core.block;

import com.dgiim.dgiimcraft.DgiimCraft;
import com.dgiim.dgiimcraft.arboriculture.states.StateMapperArboriculture;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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

    @SideOnly(Side.CLIENT)
    public StateMapperBase getStateMapper() {
        return null;
    }

}
