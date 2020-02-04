package cn.Hanabi.injection.mixins;

import net.minecraft.entity.*;
import net.minecraft.client.renderer.entity.*;
import org.spongepowered.asm.mixin.*;

@Mixin({ Render.class })
abstract class MixinRenderer<T extends Entity>
{
    MixinRenderer() {
        super();
    }
    
    @Shadow
    protected abstract boolean func_180548_c$49504eb5();
}
