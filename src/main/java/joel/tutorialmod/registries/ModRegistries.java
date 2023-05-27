package joel.tutorialmod.registries;

import joel.tutorialmod.TutorialMod;
import joel.tutorialmod.block.ModBlocks;
import joel.tutorialmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModFuels() {
        System.out.println("Now registering fuels for " + TutorialMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModBlocks.NATHAN_LOG, 300);
        registry.add(ModBlocks.NATHAN_WOOD, 300);
        registry.add(ModBlocks.STRIPPED_NATHAN_LOG, 300);
        registry.add(ModBlocks.STRIPPED_NATHAN_WOOD, 300);
        registry.add(ModBlocks.NATHAN_PLANKS, 300);
        registry.add(ModBlocks.NATHAN_SLAB, 175);
        registry.add(ModBlocks.NATHAN_STAIRS, 300);
        registry.add(ModBlocks.NATHAN_PRESSURE_PLATE, 300);
        registry.add(ModBlocks.NATHAN_BUTTON, 100);
        registry.add(ModBlocks.NATHAN_TRAPDOOR, 300);
        registry.add(ModBlocks.NATHAN_FENCE, 300);
        registry.add(ModBlocks.NATHAN_FENCE_GATE, 300);
        registry.add(ModBlocks.NATHAN_DOOR, 200);
    }
}
