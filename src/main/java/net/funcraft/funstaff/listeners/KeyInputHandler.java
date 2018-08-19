package net.funcraft.funstaff.listeners;

import net.funcraft.funstaff.gui.menu.GuiMenu;
import net.funcraft.funstaff.proxy.CommonProxy;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KeyInputHandler {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void onKeyInputEvent(KeyInputEvent event) {

		// Vérifier si la touche(HOME) pour ouvrir le gui est frappée
		if (CommonProxy.keyBindings[0].isPressed()) {

			// Ouvrir le menu principal
			Minecraft.getMinecraft().displayGuiScreen(new GuiMenu());

		}
	}

}
