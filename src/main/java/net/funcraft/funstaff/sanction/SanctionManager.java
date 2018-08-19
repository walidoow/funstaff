package net.funcraft.funstaff.sanction;

import java.util.ArrayList;
import java.util.List;

import net.funcraft.funstaff.ressources.Values;

public class SanctionManager {

	/*
	 * Apr�s chaque mute effectu�, les sanctions sont enregistr�es. Le joueur
	 * sanctionn�, le message et la date o� la sanction a �t� effectu�e sont
	 * enregistr�s.
	 */

	private static List<String> messages = new ArrayList<String>();
	private static String username;
	private static boolean mute = false;

	// La m�thode qui va se charger d'obtenir les messages signal�s, le joueur
	// sanctionn� et cr�er un object Sanction
	public static void checkSanction(String s) {
		System.out.println(s);

		// Cr�er les sanction
		if (s.equals("[SS] La sanction a \u00E9t\u00E9 appliqu\u00E9e !")) {
			if (!mute) {
				// Ajouter un ban
				Values.BANS++;
				return;
			}

			// Cr�er la sanction
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
		}
	}

}
