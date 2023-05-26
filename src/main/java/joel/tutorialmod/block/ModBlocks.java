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
import net.minecraft.util.SignType;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import javax.naming.ldap.PagedResultsControl;

public class ModBlocks {
    public static final Block NATHAN_BLOCK = registerBlock("beloved_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(2000000000)), ModItemGroup.NATHAN);
    public static final Block NATHAN_BLOCK_2 = registerBlock("beloved_block_2",
            new Block(FabricBlockSettings.of(Material.METAL).strength(1.0f).requiresTool().luminance(2000000000)), ModItemGroup.NATHAN);
    public static final Block NATHAN_ORE = registerBlock("beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block DEEPSLATE_NATHAN_ORE = registerBlock("deepslate_beloved_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block NATHAN_ORE_2 = registerBlock("beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
    public static final Block DEEPSLATE_NATHAN_ORE_2 = registerBlock("deepslate_beloved_ore_2",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).strength(1.0f).requiresTool(), UniformIntProvider.create(555, 555)), ModItemGroup.NATHAN);
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
                    30, true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON), ModItemGroup.NATHAN);

    public static final Block NATHAN_DOOR = registerBlock("beloved_door",
            new DoorBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque(), SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN), ModItemGroup.NATHAN);

    public static final Block NATHAN_STAIRS = registerBlock("beloved_stairs",
            new StairsBlock(NATHAN_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(NATHAN_PLANKS)), ModItemGroup.NATHAN);

    public static final Block NATHAN_SLAB = registerBlock("beloved_slab",
            new SlabBlock(AbstractBlock.Settings.copy(NATHAN_PLANKS)), ModItemGroup.NATHAN);

    public static final Block NATHAN_TRAPDOOR = registerBlock("beloved_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque(), SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN), ModItemGroup.NATHAN);

    public static final Block NATHAN_FENCE = registerBlock("beloved_fence",
            new FenceBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque()), ModItemGroup.NATHAN);

    public static final Block NATHAN_FENCE_GATE = registerBlock("beloved_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.of(Material.DECORATION).strength(0.5f).nonOpaque(), SoundEvents.BLOCK_FENCE_GATE_CLOSE, SoundEvents.BLOCK_FENCE_GATE_OPEN), ModItemGroup.NATHAN);

   /* public static final Block NATHAN_SIGN = registerBlock("beloved_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.ACACIA_SIGN), SignType.ACACIA), ModItemGroup.NATHAN);

    public static final Block NATHAN_WALL_SIGN = registerBlockWithoutBlockItem("beloved_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.ACACIA_WALL_HANGING_SIGN), SignType.ACACIA), ModItemGroup.NATHAN);

    public static final Block NATHAN_HANGING_SIGN = registerBlock("beloved_hanging_sign",
            new HangingSignBlock(FabricBlockSettings.copy(Blocks.ACACIA_HANGING_SIGN), SignType.ACACIA), ModItemGroup.NATHAN);

    public static final Block NATHAN_HANGING_WALL_SIGN = registerBlockWithoutBlockItem("beloved_hanging_wall_sign",
            new WallHangingSignBlock(FabricBlockSettings.copy(Blocks.ACACIA_WALL_HANGING_SIGN), SignType.ACACIA), ModItemGroup.NATHAN);
*/
    public static final Block NATHAN_PRESSURE_PLATE = registerBlock("beloved_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD).strength(0.5f).noCollision(), SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON),
            ModItemGroup.NATHAN);

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
