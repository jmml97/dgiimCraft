package com.dgiim.dgiimcraft.world;

import com.dgiim.dgiimcraft.core.block.BlockRegistry;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

import java.util.Random;

/**
 * Created by jmmar on 28/06/2017.
 */
public class WorldGenMangoTree extends WorldGenAbstractTree {


    private static final IBlockState log = BlockRegistry.mangoLogBlock.getDefaultState();

    public WorldGenMangoTree(World w, Random r, BlockPos bp) {
        super(true);
        generate(w, r, bp);
    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {

        int i = rand.nextInt(3) + rand.nextInt(3) + 5;
        if (position.getY() >= 1 && position.getY() + i + 1 <= 256) {
            this.setBlockToLog(worldIn, position);
        }

        return false;
    }

    private void setBlockToLog(World world, BlockPos pos)
    {
        this.setBlockAndNotifyAdequately(world, pos, log);

    }

    
}
