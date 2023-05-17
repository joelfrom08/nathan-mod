package joel.tutorialmod.block;

import joel.tutorialmod.TutorialMod;
import joel.tutorialmod.TutorialModClient;
import joel.tutorialmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block NATHAN_BLOCK = registerBlock("beloved_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(200)), ModItemGroup.NATHAN);
    public static final Block NATHAN_BLOCK_2 = registerBlock("beloved_block_2",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(200)), ModItemGroup.NATHAN);
    public static final Block NATHAN_ORE = registerBlock("beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block DEEPSLATE_NATHAN_ORE = registerBlock("deepslate_beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_ORE_2 = registerBlock("beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block DEEPSLATE_NATHAN_ORE_2 = registerBlock("deepslate_beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_FLOWER = registerBlock("beloved_flower",
            new FlowerBlock(StatusEffects.RESISTANCE, 120,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(4.0f).nonOpaque()), ModItemGroup.NATHAN);

    public static final Block POTTED_NATHAN_FLOWER = registerBlockWithoutBlockItem("potted_beloved_flower",
            new FlowerPotBlock(ModBlocks.NATHAN_FLOWER,
                    FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()), ModItemGroup.NATHAN);
    public static final Block RAW_NATHAN_BLOCK = registerBlock("raw_beloved_ore_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(20)), ModItemGroup.NATHAN);
    public static final Block RAW_NATHAN_BLOCK_2 = registerBlock("raw_beloved_ore_2_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(20)), ModItemGroup.NATHAN);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
