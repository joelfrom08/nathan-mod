package joel.tutorialmod.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.NATHAN_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_NATHAN_LOG, 5, 5);
        registry.add(ModBlocks.NATHAN_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_NATHAN_WOOD, 5, 5);

        registry.add(ModBlocks.NATHAN_LEAVES, 30, 60);
        registry.add(ModBlocks.NATHAN_PLANKS, 5, 20);
    }
}
