package joel.tutorialmod;

import joel.tutorialmod.block.ModBlocks;
import joel.tutorialmod.block.ModFlammableBlockRegistry;
import joel.tutorialmod.item.ModItemGroup;
import joel.tutorialmod.item.ModItems;
import joel.tutorialmod.registries.ModRegistries;
import joel.tutorialmod.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModWorldGeneration.generateModWorldGen();
        ModRegistries.registerModFuels();

        ModFlammableBlockRegistry.registerFlammableBlocks();
        StrippableBlockRegistry.register(ModBlocks.NATHAN_LOG, ModBlocks.STRIPPED_NATHAN_LOG);
        StrippableBlockRegistry.register(ModBlocks.NATHAN_WOOD, ModBlocks.STRIPPED_NATHAN_WOOD);

    }
}