package net.funcraft.funstaff.proxy;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	// Déclarer la liste des touches de contrôle
	public static KeyBinding[] keyBindings;

	public void preInit(FMLPreInitializationEvent event) {

	}

	public void init(FMLInitializationEvent event) {

		// Déclarer la liste des touches de contrôle
		keyBindings = new KeyBinding[1];
		// Initier les touches de contrôle
		keyBindings[0] = new KeyBinding("key.hud.desc", Keyboard.KEY_HOME, "key.categories.gameplay");
		// Répertorier toutes les touches
		ClientRegistry.registerKeyBinding(keyBindings[0]);
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

}
