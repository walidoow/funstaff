package net.funcraft.funstaff.gui.overlay;

import net.funcraft.funstaff.ressources.Conditions;
import net.funcraft.funstaff.ressources.Strings;
import net.funcraft.funstaff.ressources.Values;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiOverlaySanction extends Gui {

	@SubscribeEvent
	public void onRenderGameOverlayEvent(RenderGameOverlayEvent event) {
		if (!event.getType().equals(ElementType.TEXT))
			return;
		Minecraft.getMinecraft().fontRendererObj.drawString(Values.MUTES + " mutes", 5, 5,
				Conditions.MUTE_MODE ? 0x33FF33 : 0xCC0000, false);
		Minecraft.getMinecraft().fontRendererObj.drawString(Values.BANS + " bans", 5, 15,
				Conditions.MUTE_MODE ? 0xCC0000 : 0x00FF00, false);

	}
}
