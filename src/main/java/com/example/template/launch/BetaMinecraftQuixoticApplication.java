package com.example.template.launch;

import io.github.betterclient.quixotic.QuixoticApplication;
import io.github.betterclient.quixotic.QuixoticClassLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetaMinecraftQuixoticApplication implements QuixoticApplication {
    @Override
    public String getApplicationName() {
        return "Minecraft";
    }

    @Override
    public String getApplicationVersion() {
        return "beta 1.1_02";
    }

    @Override
    public String getMainClass() {
        return "net.minecraft.client.Minecraft";
    }

    @Override
    public void loadApplicationManager(QuixoticClassLoader quixoticClassLoader) {

    }

    @Override
    public List<String> getMixinConfigurations() {
        return new ArrayList<String>(Arrays.asList("mixins.client.json"));
    }
}
