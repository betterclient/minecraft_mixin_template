package com.example.template.mixin;

import net.minecraft.client.GuiScreen;
import net.minecraft.client.Session;
import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GuiMainMenu.class)
public class MixinExample extends GuiScreen {

    @Inject(method = "initGui", at = @At("HEAD"))
    public void initGui1(CallbackInfo ci) { //Show Quit Game button
        this.mc.field_6317_l = false;
    }


    @Inject(method = "initGui", at = @At("RETURN"))
    public void initGui(CallbackInfo ci) {// Allows playing in alpha place
        this.mc.session = new Session("BetterClient", "token:<ACCESS TOKEN>:<PROFILE ID>");
    }
}
