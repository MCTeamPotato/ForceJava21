package com.teampotato.forcejava21;

import net.minecraftforge.fml.common.Mod;

@Mod(ForceJava21.MOD_ID)
public class ForceJava21 {
    public static final String MOD_ID = "forcejava21";

    public static void main(String[] arg) {
        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);
    }
}
