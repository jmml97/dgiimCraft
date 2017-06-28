package com.dgiim.dgiimcraft.arboriculture.item;

import com.dgiim.dgiimcraft.core.item.ItemBlockDgiim;
import net.minecraft.block.Block;

/**
 * Created by jmml on 27/6/17.
 */
public class ItemBlockMangoLog extends ItemBlockDgiim {

    public static final String NAME = "mango_log_item";

    public ItemBlockMangoLog(Block block) {
        super(block);
        setItemName(this, NAME);
    }
}
