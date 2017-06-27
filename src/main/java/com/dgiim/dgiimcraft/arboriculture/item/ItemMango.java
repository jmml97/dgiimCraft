package com.dgiim.dgiimcraft.arboriculture.item;

import com.dgiim.dgiimcraft.core.item.ItemDgiimFood;

/**
 * Created by jmml on 27/6/17.
 * Un mango
 */
public class ItemMango extends ItemDgiimFood {

    public static final String NAME = "mango_item";

    public ItemMango() {
        super(4, 0.2f, false, NAME);

        // El número máximo de mangos por stack es 16
        setMaxStackSize(16);
    }
}
