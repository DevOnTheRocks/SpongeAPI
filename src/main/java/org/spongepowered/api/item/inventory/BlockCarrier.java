package org.spongepowered.api.item.inventory;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

/**
 * Represents a Block that is a carrier of an Inventory
 * e.g. An Anvil
 */
public interface BlockCarrier extends Carrier {

    /**
     * Returns the Location of the Block
     *
     * @return The Location of the Block
     */
    Location<World> getLocation();
}

// TODO Implementation: Could me mixed in into the Containers