package joel.tutorialmod.item;

import joel.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup NATHAN;

    public static void registerItemGroups() {
        NATHAN = FabricItemGroup.builder(new Identifier(TutorialMod.MOD_ID, "nathan"))
                .displayName(Text.translatable("itemgroup.nathan"))
                .icon(() -> new ItemStack(ModItems.NATHAN2)).build();
    }

}
