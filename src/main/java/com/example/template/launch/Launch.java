package com.example.template.launch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launch {
    
    public static void main(String... context) {
        List<String> string = new ArrayList<>(Arrays.asList(context));

        string.add("--tweakClass");
        string.add("com.example.template.launch.Tweaker");

        net.minecraft.launchwrapper.Launch.main(string.toArray(new String[0]));
    }
}
