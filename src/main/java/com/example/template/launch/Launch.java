package com.example.template.launch;

import io.github.betterclient.quixotic.Quixotic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launch {
    
    public static void main(String... context) throws Exception {
        List<String> string = new ArrayList<>(Arrays.asList(context));

        string.add("--quixoticapp");
        string.add("com.example.template.launch.BetaMinecraftQuixoticApplication");

        Quixotic.main(string.toArray(new String[0]));
    }
}
