package net.funcraft.funstaff;

import net.funcraft.funstaff.gui.overlay.GuiOverlaySanction;
import net.funcraft.funstaff.listeners.ChatReceiveEvent;
import net.funcraft.funstaff.listeners.KeyInputHandler;
import net.funcraft.funstaff.proxy.CommonProxy;
import net.funcraft.funstaff.ressources.Strings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.VERSION)
public class Main {

    @SidedProxy(clientSide = Strings.CLIENT_PROXY_CLASS, serverSide = Strings.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

        // Écouter l'événement où une touche du clavier est frappée
        MinecraftForge.EVENT_BUS.register(new KeyInputHandler());
        // Écouter l'événement où l'overlay est rendu
        MinecraftForge.EVENT_BUS.register(new GuiOverlaySanction());
        // Écouter l'événement où le joueur reçoit un message dans le chat
        MinecraftForge.EVENT_BUS.register(new ChatReceiveEvent());
        // Lancer la méthode de la préinitialisation pour le CommonProxy
        proxy.preInit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {

        // Lancer la méthode d'initialisation pour le CommonProxy
        proxy.init(event);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

        // Lancer la méthode du post initialisation pour le CommonProxy
        proxy.postInit(event);
    }

}
