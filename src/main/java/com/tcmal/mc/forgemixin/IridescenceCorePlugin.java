package com.tcmal.mc.forgemixin;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;

/**
 * Dummy coremod to initiate Mixins.
 */
@IFMLLoadingPlugin.Name("iridescence")
public class IridescenceCorePlugin implements IFMLLoadingPlugin {

    public IridescenceCorePlugin() {
        System.out.println("About to start Mixin!");

        // Start mixin system
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.iridescence.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
