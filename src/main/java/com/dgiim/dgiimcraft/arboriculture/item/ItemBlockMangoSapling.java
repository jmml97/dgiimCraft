package com.dgiim.dgiimcraft.arboriculture.item;

import com.dgiim.dgiimcraft.core.item.ItemBlockDgiim;
import net.minecraft.block.Block;

/**
 * Created by jmmar on 28/06/2017.
 */
public class ItemBlockMangoSapling extends ItemBlockDgiim {

    public static final String NAME = "mango_sapling_item";

    public ItemBlockMangoSapling(Block block) {
        super(block);
        setItemName(this, NAME);
    }
}
