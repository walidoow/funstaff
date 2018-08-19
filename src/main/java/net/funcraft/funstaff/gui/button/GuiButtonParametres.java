package net.funcraft.funstaff.gui.button;

import net.funcraft.funstaff.ressources.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;

public class GuiButtonParametres extends GuiButton {

	private final ResourceLocation texture = new ResourceLocation(Strings.MOD_ID, "textures/gui/Menu.png");
	static int guiWidth = 120, guiHeight = 32;
	int u = 0, v = 183;

	public GuiButtonParametres(int buttonId, int x, int y) {
		super(buttonId, x, y, guiWidth, guiHeight, "");
	}

	@Override
	public void drawButton(Minecraft mc, int mouseX, int mouseY) {
		mc.renderEngine.bindTexture(texture);
		if (mouseX >= xPosition && mouseX <= xPosition + width && mouseY >= yPosition && mouseY <= yPosition + height) {
			hovered = true;
		} else
			hovered = false;
		if (hovered)
			u = 121;
		else
			u = 0;
		drawTexturedModalRect(xPosition, yPosition, u, v, width, height);

	}
}
