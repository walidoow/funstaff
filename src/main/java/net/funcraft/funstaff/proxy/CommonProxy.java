package net.funcraft.funstaff.proxy;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	// D�clarer la liste des touches de contr�le
	public static KeyBinding[] keyBindings;

	public void preInit(FMLPreInitializationEvent event) {

	}

	public void init(FMLInitializationEvent event) {

		// D�clarer la liste des touches de contr�le
		keyBindings = new KeyBinding[1];
		// Initier les touches de contr�le
		keyBindings[0] = new KeyBinding("key.hud.desc", Keyboard.KEY_HOME, "key.categories.gameplay");
		// R�pertorier toutes les touches
		ClientRegistry.registerKeyBinding(keyBindings[0]);
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

}
