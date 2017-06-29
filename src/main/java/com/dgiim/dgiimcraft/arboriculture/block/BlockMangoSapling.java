package com.dgiim.dgiimcraft.arboriculture.block;

import com.dgiim.dgiimcraft.DgiimCraft;
import com.dgiim.dgiimcraft.arboriculture.states.StateMapperArboriculture;
import com.dgiim.dgiimcraft.world.WorldGenMangoTree;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

/**
 * Created by jmmar on 28/06/2017.
 */
public class BlockMangoSapling extends BlockSapling {


    public static final String NAME = "mango_sapling_block";

    public BlockMangoSapling() {
        super();
        this.setRegistryName(DgiimCraft.MODID, NAME);
        this.setUnlocalizedName(this.getRegistryName().toString());
        this.setCreativeTab(DgiimCraft.tabMain);

    }

    @SideOnly(Side.CLIENT)
    public StateMapperBase getStateMapper() {
        return new StateMapperArboriculture();
    }

    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        this.generateTree(worldIn, pos, state, rand);
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
            {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    @Override
    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (((Integer)state.getValue(STAGE)).intValue() == 0)
        {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else
        {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    @Override
    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        WorldGenerator gen = (WorldGenerator)(new WorldGenMangoTree(worldIn, rand, pos));
    }
}
