package com.teampotato.forcejava21.mixin;

import net.minecraftforge.versions.forge.ForgeVersion;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;
import org.spongepowered.asm.util.JavaVersion;

import java.util.List;
import java.util.Set;

public class Plugin implements IMixinConfigPlugin {
    public Plugin() {
        int javaVersion = (int) JavaVersion.current();
        if (javaVersion != 21.0) {
            System.out.println("Please use Java 21 and Forge 36.2.41+ to launch Minecraft");
            System.out.println("Current Java version: " + javaVersion + ". Current Forge version: " + ForgeVersion.getVersion());
            System.out.println("Recommendations: ");
            System.out.println("Zulu: https://www.azul.com/downloads/?version=java-21-lts&package=jdk#zulu");
            System.out.println("Oracle: https://www.oracle.com/java/technologies/downloads/#java21");
            System.out.println("Temurin: https://adoptium.net/temurin/releases/?version=21");
            Runtime.getRuntime().exit(-1);
        }
    }

    @Override
    public void onLoad(String s) {

    }

    @Override
    public String getRefMapperConfig() {
        return null;
    }

    @Override
    public boolean shouldApplyMixin(String s, String s1) {
        return false;
    }

    @Override
    public void acceptTargets(Set<String> set, Set<String> set1) {

    }

    @Override
    public List<String> getMixins() {
        return null;
    }

    @Override
    public void preApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }

    @Override
    public void postApply(String s, ClassNode classNode, String s1, IMixinInfo iMixinInfo) {

    }
}
