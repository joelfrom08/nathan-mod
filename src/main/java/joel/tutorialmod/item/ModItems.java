package joel.tutorialmod.item;

import joel.tutorialmod.TutorialMod;
import joel.tutorialmod.item.custom.ModAxeItem;
import joel.tutorialmod.item.custom.ModHoeItem;
import joel.tutorialmod.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NATHAN = registerItem("my_beloved",
            new Item(new FabricItemSettings()));
    public static final Item NATHAN2 = registerItem("my_beloved_2",
            new Item(new FabricItemSettings()));
    public static final Item RAW_NATHAN = registerItem("raw_beloved_ore",
            new Item(new FabricItemSettings()));
    public static final Item RAW_NATHAN2 = registerItem("raw_beloved_ore_2",
            new Item(new FabricItemSettings()));

    public static final Item NATHAN_SWORD = registerItem("beloved_sword",
            new SwordItem(ModToolMaterials.NATHAN, 1, 2f, new FabricItemSettings()));
    public static final Item NATHAN_PICKAXE = registerItem("beloved_pickaxe",
            new ModPickaxeItem(ModToolMaterials.NATHAN, (1+1/2), 1.1f, new FabricItemSettings()));
    public static final Item NATHAN_AXE = registerItem("beloved_axe",
            new ModAxeItem(ModToolMaterials.NATHAN, 2, 2f, new FabricItemSettings()));
    public static final Item NATHAN_SHOVEL = registerItem("beloved_shovel",
            new ShovelItem(ModToolMaterials.NATHAN, 0, 0.2f, new FabricItemSettings()));
    public static final Item NATHAN_HOE = registerItem("beloved_hoe",
            new ModHoeItem(ModToolMaterials.NATHAN, 0, 0.2f, new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.NATHAN, NATHAN);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN2);
        addToItemGroup(ModItemGroup.NATHAN, RAW_NATHAN);
        addToItemGroup(ModItemGroup.NATHAN, RAW_NATHAN2);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN_SWORD);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN_PICKAXE);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN_AXE);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN_SHOVEL);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN_HOE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        addItemsToItemGroup();
    }
}
