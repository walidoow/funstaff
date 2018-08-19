package net.funcraft.funstaff.listeners;

import net.funcraft.funstaff.sanction.SanctionManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatReceiveEvent {

	@SubscribeEvent
	public void onChatReceiveEvent(ClientChatReceivedEvent event) {

		// Obtenir le message reçu par le joueur
		ITextComponent message = event.getMessage();
		for (String s : message.getUnformattedText().split("\\n"))
			// Vérifier les messages reçus pour créer une sanction
			SanctionManager.checkSanction(message.getUnformattedText());
	}
}
