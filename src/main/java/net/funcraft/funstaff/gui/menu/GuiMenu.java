package net.funcraft.funstaff.gui.menu;

import java.io.IOException;

import net.funcraft.funstaff.gui.button.GuiButtonGradeperso;
import net.funcraft.funstaff.gui.button.GuiButtonMessages;
import net.funcraft.funstaff.gui.button.GuiButtonParametres;
import net.funcraft.funstaff.gui.button.GuiButtonSanction;
import net.funcraft.funstaff.gui.button.GuiButtonScreenshots;
import net.funcraft.funstaff.ressources.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;

/*
 * 
 *  Ceci est le menu principal du mod lorsqu'on appuie sur la touche de contr�le HOME qui est par d�faut sur le jeu
 *  Elle permet d'avoir acc�s aux sections suivantes: sanctions, screenshots, grade personnalis�s, messages et param�tres
 * 
 */

public class GuiMenu extends GuiScreen {

	final ResourceLocation texture = new ResourceLocation(Strings.MOD_ID, "textures/gui/Menu.png");

	private int guiWidth = 206, guiHeight = 49;
	private int centerX = (width / 2) - guiWidth / 2;
	private int centerY = (height / 2) - guiHeight / 2;
	private GuiButtonSanction guiButtonSanction;
	private GuiButtonScreenshots guiButtonScreenshots;
	private GuiButtonGradeperso guiButtonGradeperso;
	private GuiButtonMessages guiButtonMessages;
	private GuiButtonParametres guiButtonParametres;

	@Override
	public void initGui() {

		// Supprimer tout les bouttons qui pourraient �tres ajout�s
		buttonList.clear();

		/*
		 * Bouttons ajout�s
		 */
		// Ajouter le boutton des sanctions dans la liste des bouttons
		buttonList.add(guiButtonSanction = new GuiButtonSanction(0, 10, 75));
		// Ajouter le boutton des screenshots dans la liste des bouttons
		buttonList.add(guiButtonScreenshots = new GuiButtonScreenshots(1, 10, 125));
		// Ajouter le boutton des grades person dans la liste des bouttons
		buttonList.add(guiButtonGradeperso = new GuiButtonGradeperso(2, 10, 175));
		// Ajouter le boutton des messages dans la liste des bouttons
		buttonList.add(guiButtonMessages = new GuiButtonMessages(3, 140, 75));
		// Ajouter le boutton des param�tres dans la liste des bouttons
		buttonList.add(guiButtonParametres = new GuiButtonParametres(4, 140, 125));

		super.initGui();
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {

		// Lier la texture
		Minecraft.getMinecraft().renderEngine.bindTexture(texture);
		// Dessiner le font arri�re en noir
		drawDefaultBackground();
		// Dessiner la texture sur l'�cran
		drawTexturedModalRect(0, 0, 0, 0, guiWidth, guiHeight);
		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	/*
	 * Tous les �v�nements o� le joueur a interagi avec un boutton se retrouvent
	 * ici
	 */
	@Override
	protected void actionPerformed(GuiButton button) throws IOException {
		super.actionPerformed(button);
		switch (button.id) {

		// Boutton sanction
		case 0: {

			break;
		}
		// Boutton screenshots
		case 1: {

			break;
		}
		// Boutton grade personnalis�
		case 2: {

			break;
		}
		// Boutton messages
		case 3: {

			break;
		}
		// Boutton param�tres
		case 4: {

			break;
		}
		}
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

}
