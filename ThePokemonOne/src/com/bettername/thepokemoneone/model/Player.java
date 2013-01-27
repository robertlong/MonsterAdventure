package com.bettername.thepokemoneone.model;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemoneone.model.Monster.WebMonster;
import com.bettername.thepokemonone.Config;

public class Player {
	
	public enum Gender {
		Male,
		Female
		;
	}
	
	public String username;
	public String uuid;
	public Gender gender;
	public WebMonster startingMonster;
	private List<Monster> monsters = new ArrayList<Monster>();
	public double[] location = new double[2];
	
	/* Current User Singleton + Static Methods*/
	private static Player currentUser = null;
	
	public static void setCurrentUser(Player currentUser) {
		Player.currentUser = currentUser;
	}
	public static Player getCurrentUser() {
		if (currentUser == null) {
			// exec an asynchronous task
			
		}
		return currentUser;
	}
	
	
	public Player(String username, Gender gender) {
		this.username = username;
		this.gender = gender;
	}
	
	public void addMonster(Monster monster) {
		monsters.add(monster);
	}
	
	public static Player createCurrentUser(String username, Gender gender, Monster monster) {
		Player.currentUser = new Player(username, gender);
		String udid = Config.getUdid();
		Player.currentUser.uuid = "510485f13a812433ed312c17";
		Player.currentUser.startingMonster = monster.getWebMonster();
		Player.currentUser.monsters.add(monster);
		return currentUser;
	}
	

    public boolean isAnyoneThere() {
        for (int x = 0; x < monsters.size(); x++)
            if (monsters.get(x).isAlive())
                return true;

        // Return False if the for loop completes
        return false;
    }
	
	
}