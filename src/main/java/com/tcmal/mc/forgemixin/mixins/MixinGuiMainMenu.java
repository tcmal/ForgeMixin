package com.tcmal.mc.forgemixin.mixins;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu extends GuiScreen {

    @Shadow
    private float minceraftRoll;


    /**
     * Sets us up to always roll "minceraft"
     * <p>
     * `<init>` is the name the compiler gives the constructor.
     *
     * @param _ci Required by Sponge Mixin.
     */
    @Inject(method = "<init>", at = @At("RETURN"))
    protected void beforeDrawScreen(CallbackInfo _ci) {
        this.minceraftRoll = 0.0001f;
    }

}
