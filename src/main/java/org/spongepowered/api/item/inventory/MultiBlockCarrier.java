package org.spongepowered.api.item.inventory;

import org.spongepowered.api.world.Location;
import org.spongepowered.api.world.World;

import java.util.List;
import java.util.Optional;

/**
 * Represents Multiple Blocks that are the Carrier for an Inventory.
 * e.g. A DoubleChest Inventory carried by two blocks
 */
public interface MultiBlockCarrier extends Carrier {

    /**
     * Returns the Locations of the Blocks
     *
     * @return The Locations of the Blocks
     */
    List<Location<World>> getLocations();

    // TODO maybe to get upper/lower inventory?
    Optional<Inventory> getInventory(Location<World> at);
}

// TODO implementation: ContainerUtil for InventoryLargeChest?

