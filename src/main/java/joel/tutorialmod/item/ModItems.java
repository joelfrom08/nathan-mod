package joel.tutorialmod.item;

import joel.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
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



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.NATHAN, NATHAN);
        addToItemGroup(ModItemGroup.NATHAN, NATHAN2);
        addToItemGroup(ModItemGroup.NATHAN, RAW_NATHAN);
        addToItemGroup(ModItemGroup.NATHAN, RAW_NATHAN2);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);

        addItemsToItemGroup();
    }
}
