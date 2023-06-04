package joel.tutorialmod.block;

import joel.tutorialmod.TutorialMod;
import joel.tutorialmod.TutorialModClient;
import joel.tutorialmod.block.custom.ModPressurePlateBlock;
import joel.tutorialmod.item.ModItemGroup;
import joel.tutorialmod.item.ModItems;
import joel.tutorialmod.world.tree.NathanSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.structure.StrongholdGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.biome.source.MultiNoiseBiomeSourceParameterList;

import javax.naming.ldap.PagedResultsControl;

public class ModBlocks {
    public static final Block NATHAN_BLOCK = registerBlock("beloved_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(15)), ModItemGroup.NATHAN);
    public static final Block NATHAN_BLOCK_2 = registerBlock("beloved_block_2",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(15)), ModItemGroup.NATHAN);
    public static final Block NATHAN_ORE = registerBlock("beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block DEEPSLATE_NATHAN_ORE = registerBlock("deepslate_beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_ORE_2 = registerBlock("beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block DEEPSLATE_NATHAN_ORE_2 = registerBlock("deepslate_beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_FLOWER = registerBlock("beloved_flower",
            new FlowerBlock(StatusEffects.RESISTANCE, 120,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(0.1f).nonOpaque()), ModItemGroup.NATHAN);

    public static final Block POTTED_NATHAN_FLOWER = registerBlockWithoutBlockItem("potted_beloved_flower",
            new FlowerPotBlock(ModBlocks.NATHAN_FLOWER,
                    FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()), ModItemGroup.NATHAN);
    public static final Block RAW_NATHAN_BLOCK = registerBlock("raw_beloved_ore_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool().luminance(20)), ModItemGroup.NATHAN);
    public static final Block RAW_NATHAN_BLOCK_2 = registerBlock("raw_beloved_ore_2_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool().luminance(20)), ModItemGroup.NATHAN);

    public static final Block NATHAN_LOG = registerBlock("beloved_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(1.0f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_WOOD = registerBlock("beloved_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(1.0f)), ModItemGroup.NATHAN);
    public static final Block STRIPPED_NATHAN_LOG = registerBlock("stripped_beloved_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(1.0f)), ModItemGroup.NATHAN);
    public static final Block STRIPPED_NATHAN_WOOD = registerBlock("stripped_beloved_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(1.0f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_PLANKS = registerBlock("beloved_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(1.0f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_LEAVES = registerBlock("beloved_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(0.3f)), ModItemGroup.NATHAN);

    public static final Block NATHAN_SAPLING = registerBlock("beloved_sapling",
            new SaplingBlock(new NathanSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(0.3f)), ModItemGroup.NATHAN);

    public static final Block NATHAN_BUTTON = registerBlock("beloved_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f).sounds(BlockSoundGroup.WOOD),
                    BlockSetType.CHERRY, 30, true), ModItemGroup.NATHAN);

    public static final Block NATHAN_DOOR = registerBlock("beloved_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque(), BlockSetType.CHERRY), ModItemGroup.NATHAN);

    public static final Block NATHAN_STAIRS = registerBlock("beloved_stairs",
            new StairsBlock(NATHAN_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(NATHAN_PLANKS)), ModItemGroup.NATHAN);

    public static final Block NATHAN_SLAB = registerBlock("beloved_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NATHAN_PLANKS)), ModItemGroup.NATHAN);

    public static final Block NATHAN_TRAPDOOR = registerBlock("beloved_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque(), BlockSetType.CHERRY), ModItemGroup.NATHAN);

    public static final Block NATHAN_FENCE = registerBlock("beloved_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque()), ModItemGroup.NATHAN);

    public static final Block NATHAN_FENCE_GATE = registerBlock("beloved_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque(), WoodType.CHERRY), ModItemGroup.NATHAN);

    public static final Block NATHAN_PRESSURE_PLATE = registerBlock("beloved_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(0.5f).noCollision(), BlockSetType.CHERRY),
            ModItemGroup.NATHAN);

    public static final Block NATHAN_DIRT = registerBlock("beloved_dirt",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_GRASS_BLOCK = registerBlock("beloved_grass_block",
            new GrassBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DIRT_PATH = registerBlock("beloved_dirt_path",
            new DirtPathBlock(FabricBlockSettings.copy(Blocks.DIRT_PATH).strength(0.5f)), ModItemGroup.NATHAN);

    public static final Block NATHAN_STONE_NATHAN_ORE = registerBlock("beloved_stone_beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_NATHAN_ORE = registerBlock("beloved_deepslate_beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_NATHAN_ORE_2 = registerBlock("beloved_stone_beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_NATHAN_ORE_2 = registerBlock("beloved_deepslate_beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);


    public static final Block NATHAN_STONE = registerBlock("beloved_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE = registerBlock("beloved_deepslate",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BRICKS = registerBlock("beloved_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BRICK_SLAB = registerBlock("beloved_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_SLAB).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BRICK_STAIRS = registerBlock("beloved_stone_brick_stairs",
            new StairsBlock(NATHAN_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BRICK_WALL = registerBlock("beloved_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BRICK_PRESSURE_PLATE = registerBlock("beloved_stone_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(0.5f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BRICK_BUTTON = registerBlock("beloved_stone_brick_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f).sounds(BlockSoundGroup.STONE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_SLAB = registerBlock("beloved_stone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.STONE_SLAB).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_STAIRS = registerBlock("beloved_stone_stairs",
            new StairsBlock(NATHAN_STONE.getDefaultState(), FabricBlockSettings.copy(Blocks.STONE_BRICK_STAIRS).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_WALL = registerBlock("beloved_stone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.STONE_BRICK_WALL).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_PRESSURE_PLATE = registerBlock("beloved_stone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(0.5f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_BUTTON = registerBlock("beloved_stone_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f).sounds(BlockSoundGroup.STONE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_SLAB = registerBlock("beloved_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_SLAB).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_STAIRS = registerBlock("beloved_deepslate_stairs",
            new StairsBlock(NATHAN_DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_STAIRS).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_WALL = registerBlock("beloved_deepslate_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_WALL).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_PRESSURE_PLATE = registerBlock("beloved_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BUTTON = registerBlock("beloved_deepslate_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);

    public static final Block NATHAN_COBBLESTONE = registerBlock("beloved_cobblestone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_COBBLESTONE_SLAB = registerBlock("beloved_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE_SLAB).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_COBBLESTONE_STAIRS = registerBlock("beloved_cobblestone_stairs",
            new StairsBlock(NATHAN_COBBLESTONE.getDefaultState(), FabricBlockSettings.copy(Blocks.COBBLESTONE_STAIRS).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_COBBLESTONE_WALL = registerBlock("beloved_cobblestone_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.COBBLESTONE_WALL).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_COBBLESTONE_PRESSURE_PLATE = registerBlock("beloved_cobblestone_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(0.5f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block NATHAN_COBBLESTONE_BUTTON = registerBlock("beloved_cobblestone_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f).sounds(BlockSoundGroup.STONE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block POLISHED_NATHAN_DEEPSLATE = registerBlock("polished_beloved_deepslate",
            new Block(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block POLISHED_NATHAN_DEEPSLATE_SLAB = registerBlock("polished_beloved_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE_SLAB).strength(1f)), ModItemGroup.NATHAN);
    public static final Block POLISHED_NATHAN_DEEPSLATE_STAIRS = registerBlock("polished_beloved_deepslate_stairs",
            new StairsBlock(POLISHED_NATHAN_DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS).strength(1f)), ModItemGroup.NATHAN);
    public static final Block POLISHED_NATHAN_DEEPSLATE_WALL = registerBlock("polished_beloved_deepslate_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE_WALL).strength(1f)), ModItemGroup.NATHAN);
    public static final Block POLISHED_NATHAN_DEEPSLATE_PRESSURE_PLATE = registerBlock("polished_beloved_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block POLISHED_NATHAN_DEEPSLATE_BUTTON = registerBlock("polished_beloved_deepslate_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BRICKS = registerBlock("beloved_deepslate_bricks",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICKS).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BRICK_SLAB = registerBlock("beloved_deepslate_brick_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_SLAB).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BRICK_STAIRS = registerBlock("beloved_deepslate_brick_stairs",
            new StairsBlock(NATHAN_DEEPSLATE_BRICKS.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BRICK_WALL = registerBlock("beloved_deepslate_brick_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_BRICK_WALL).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BRICK_PRESSURE_PLATE = registerBlock("beloved_deepslate_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_BRICK_BUTTON = registerBlock("beloved_deepslate_brick_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block COBBLED_NATHAN_DEEPSLATE = registerBlock("cobbled_beloved_deepslate",
            new Block(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block COBBLED_NATHAN_DEEPSLATE_SLAB = registerBlock("cobbled_beloved_deepslate_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_SLAB).strength(1f)), ModItemGroup.NATHAN);
    public static final Block COBBLED_NATHAN_DEEPSLATE_STAIRS = registerBlock("cobbled_beloved_deepslate_stairs",
            new StairsBlock(COBBLED_NATHAN_DEEPSLATE.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS).strength(1f)), ModItemGroup.NATHAN);
    public static final Block COBBLED_NATHAN_DEEPSLATE_WALL = registerBlock("cobbled_beloved_deepslate_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.COBBLED_DEEPSLATE_WALL).strength(1f)), ModItemGroup.NATHAN);
    public static final Block COBBLED_NATHAN_DEEPSLATE_PRESSURE_PLATE = registerBlock("cobbled_beloved_deepslate_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block COBBLED_NATHAN_DEEPSLATE_BUTTON = registerBlock("cobbled_beloved_deepslate_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_TILES = registerBlock("beloved_deepslate_tiles",
            new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILES).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_TILE_SLAB = registerBlock("beloved_deepslate_tile_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILE_SLAB).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_TILE_STAIRS = registerBlock("beloved_deepslate_tile_stairs",
            new StairsBlock(NATHAN_DEEPSLATE_TILES.getDefaultState(), FabricBlockSettings.copy(Blocks.POLISHED_DEEPSLATE_STAIRS).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_TILE_WALL = registerBlock("beloved_deepslate_tile_wall",
            new WallBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_TILE_WALL).strength(1f)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_TILE_PRESSURE_PLATE = registerBlock("beloved_deepslate_tile_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_TILE_BUTTON = registerBlock("beloved_deepslate_tile_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);

    public static final Block NATHAN_STONE_COAL_ORE = registerBlock("beloved_stone_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_COAL_ORE = registerBlock("beloved_deepslate_coal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_COPPER_ORE = registerBlock("beloved_stone_copper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_COPPER_ORE = registerBlock("beloved_deepslate_copper_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_DIAMOND_ORE = registerBlock("beloved_stone_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_DIAMOND_ORE = registerBlock("beloved_deepslate_diamond_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_EMERALD_ORE = registerBlock("beloved_stone_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_EMERALD_ORE = registerBlock("beloved_deepslate_emerald_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_GOLD_ORE = registerBlock("beloved_stone_gold_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_GOLD_ORE = registerBlock("beloved_deepslate_gold_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_IRON_ORE = registerBlock("beloved_stone_iron_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_IRON_ORE = registerBlock("beloved_deepslate_iron_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_LAPIS_ORE = registerBlock("beloved_stone_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_LAPIS_ORE = registerBlock("beloved_deepslate_lapis_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_STONE_REDSTONE_ORE = registerBlock("beloved_stone_redstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_DEEPSLATE_REDSTONE_ORE = registerBlock("beloved_deepslate_redstone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);

    public static final Block CRACKED_NATHAN_DEEPSLATE_BRICKS = registerBlock("cracked_beloved_deepslate_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_DEEPSLATE_BRICK_PRESSURE_PLATE = registerBlock("cracked_beloved_deepslate_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_DEEPSLATE_BRICK_BUTTON = registerBlock("cracked_beloved_deepslate_brick_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block CHISELED_NATHAN_DEEPSLATE = registerBlock("chiseled_beloved_deepslate",
            new Block(FabricBlockSettings.copy(Blocks.CHISELED_DEEPSLATE).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_STONE_BRICKS = registerBlock("cracked_beloved_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.CRACKED_STONE_BRICKS).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_STONE_BRICK_PRESSURE_PLATE = registerBlock("cracked_beloved_stone_brick_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_STONE_BRICK_BUTTON = registerBlock("cracked_beloved_stone_brick_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_DEEPSLATE_TILES = registerBlock("cracked_beloved_deepslate_tiles",
            new Block(FabricBlockSettings.copy(Blocks.CRACKED_DEEPSLATE_TILES).strength(0.5f)), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_DEEPSLATE_TILE_PRESSURE_PLATE = registerBlock("cracked_beloved_deepslate_tile_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.STONE).strength(1f).noCollision(), BlockSetType.STONE), ModItemGroup.NATHAN);
    public static final Block CRACKED_NATHAN_DEEPSLATE_TILE_BUTTON = registerBlock("cracked_beloved_deepslate_tile_button",
            new ButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(1f).sounds(BlockSoundGroup.DEEPSLATE),
                    BlockSetType.STONE, 30, true), ModItemGroup.NATHAN);

    public static final Block NATHAN_GRASS = registerBlock("beloved_grass",
            new FernBlock(FabricBlockSettings.copy(Blocks.GRASS)), ModItemGroup.NATHAN);
    public static final Block NATHAN_TALL_GRASS = registerBlock("beloved_tall_grass",
            new TallPlantBlock(FabricBlockSettings.copy(Blocks.TALL_GRASS)), ModItemGroup.NATHAN);


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
