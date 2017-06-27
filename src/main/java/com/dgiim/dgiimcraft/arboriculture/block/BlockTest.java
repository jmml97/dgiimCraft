package com.dgiim.dgiimcraft.arboriculture.block;

import com.dgiim.dgiimcraft.core.block.BlockDgiim;
import net.minecraft.block.material.Material;

/**
 * Created by jmml on 27/6/17.
 */
public class BlockTest extends BlockDgiim {

    public static final String NAME = "test_block";

    public BlockTest() {
        super(Material.ROCK, NAME);

        setResistance(5.0F);
        setHardness(3.0F);
    }
}
