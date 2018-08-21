package net.funcraft.funstaff.sanction;

import java.util.ArrayList;
import java.util.List;

import net.funcraft.funstaff.ressources.Values;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class SanctionManager {

	/*
	 * Après chaque mute effectué, les sanctions sont enregistrées. Le joueur
	 * sanctionné, le message et la date où la sanction a été effectuée sont
	 * enregistrés.
	 */

	private static List<String> messages = new ArrayList<String>();
	private static String username;
	private static boolean mute = false;
	private static String message;

	// La méthode qui va se charger d'obtenir les messages signalés, le joueur
	// sanctionné et créer un object Sanction
	public static void checkSanction(String s) {

		System.out.println(s);
		message = s;
		if (message.length() >= 22) {
			if (s.substring(0, 22).equals("-----\nJoueur signal\u00E9:")) {
				String a = s.substring(0, 22);
				username = s.substring(0, a.indexOf("\n"));
				Minecraft.getMinecraft().thePlayer.addChatMessage(new TextComponentString(username));
			}
		}

		/*// Créer les sanction
		if (s.equals("[SS] La sanction a \u00E9t\u00E9 appliqu\u00E9e !")) {
			if (!mute) {
				// Ajouter un ban
				Values.BANS++;
				return;
			}

			// Créer la sanction
			Sanction sanction = new Sanction(username, messages);
			// Supprimer tous les messages signal�s pour les prochains reports
			messages.clear();
			mute = false;
		}

		// Obtenir le pseudo du joueur signal�
		if (s.length() >= 15) {
			if (s.substring(0, 15).equals("Joueur signal\u00E9:")) {
				mute = true;
				username = s.substring(16, s.length());
			}
		}

		// Obtenir les messages signal�s, ainsi que la personne ayant signal�
		// ces messages
		if (s.length() >= 5) {
			if (s.substring(0, 5).equals("- par")) {
				messages.add(s);
			}
		}*/
	}

}
