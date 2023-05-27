package joel.tutorialmod.block.custom;

import net.minecraft.block.BlockSetType;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.sound.SoundEvent;

public class ModPressurePlateBlock extends PressurePlateBlock {
    public ModPressurePlateBlock(ActivationRule type, Settings settings, BlockSetType blockSetType) {
        super(type, settings, blockSetType);
    }
}
