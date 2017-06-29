package com.dgiim.dgiimcraft.arboriculture.block;

import com.dgiim.dgiimcraft.arboriculture.states.StateMapperArboriculture;
import com.dgiim.dgiimcraft.core.block.BlockDgiim;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by jmml on 27/6/17.
 */
public class BlockMangoLog extends BlockDgiim {

    public static final String NAME = "mango_log_block";

    public BlockMangoLog() {
        super(Material.WOOD, NAME);

        setResistance(5.0F);
        setHardness(3.0F);

    }

    @SideOnly(Side.CLIENT)
    public StateMapperBase getStateMapper() {
        return new StateMapperArboriculture();
    }
}
