package net.funcraft.funstaff.sanction;

import java.util.ArrayList;
import java.util.List;

import net.funcraft.funstaff.ressources.Values;

public class Sanction {

	// Pseudo du joueur signal�
	String username;
	// Les messages signal�s
	List<String> messages = new ArrayList<String>();

	public Sanction(String username, List<String> messages) {
		Values.MUTES++;
		this.username = username;
		this.messages = messages;
		for (String s : messages) {
			System.out.println(username + ": " + s);
		}
	}

	public String getUsername() {
		return username;
	}

	public List<String> getMessage() {
		return messages;
	}
}
