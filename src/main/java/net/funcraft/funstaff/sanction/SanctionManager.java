package net.funcraft.funstaff.sanction;

import java.util.ArrayList;
import java.util.List;

import net.funcraft.funstaff.ressources.Values;

public class SanctionManager {

	/*
	 * Après chaque mute effectué, les sanctions sont enregistrées. Le joueur
	 * sanctionné, le message et la date où la sanction a été effectuée sont
	 * enregistrés.
	 */

	private static List<String> messages = new ArrayList<String>();
	private static String username;
	private static boolean mute = false;

	// La méthode qui va se charger d'obtenir les messages signalés, le joueur
	// sanctionné et créer un object Sanction
	public static void checkSanction(String s) {
		System.out.println(s);

		// Créer les sanction
		if (s.equals("[SS] La sanction a \u00E9t\u00E9 appliqu\u00E9e !")) {
			if (!mute) {
				// Ajouter un ban
				Values.BANS++;
				return;
			}

			// Créer la sanction
			Sanction sanction = new Sanction(username, messages);
			// Supprimer tous les messages signalés pour les prochains reports
			messages.clear();
			mute = false;
		}

		// Obtenir le pseudo du joueur signalé
		if (s.length() >= 15) {
			if (s.substring(0, 15).equals("Joueur signal\u00E9:")) {
				mute = true;
				username = s.substring(16, s.length());
			}
		}

		// Obtenir les messages signalés, ainsi que la personne ayant signalé
		// ces messages
		if (s.length() >= 5) {
			if (s.substring(0, 5).equals("- par")) {
				messages.add(s);
			}
		}
	}

}
