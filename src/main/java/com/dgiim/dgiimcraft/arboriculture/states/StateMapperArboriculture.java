package com.dgiim.dgiimcraft.arboriculture.states;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.util.ResourceLocation;

/**
 * Created by jmmar on 29/06/2017.
 */
public class StateMapperArboriculture extends StateMapperBase {

    public final String PACKAGE = "arboriculture";

    @Override
    protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
        String correctLocation = state.getBlock().getUnlocalizedName().substring(5).replace(":", ":" + PACKAGE + "/");
        ResourceLocation location = new ResourceLocation(correctLocation);

        ModelResourceLocation resourceLocation= new ModelResourceLocation(location, null);
        return resourceLocation;
    }
}
