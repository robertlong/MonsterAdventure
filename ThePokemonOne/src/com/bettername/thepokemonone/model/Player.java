package com.bettername.thepokemonone.model;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemonone.Config;
import com.bettername.thepokemonone.model.Monster.WebMonster;

public class Player {
	
	public enum Gender {
		Male,
		Female
		;
	}
	
	private String username;
	private String uuid;
	private Gender gender;
	private Monster starting_monster;
	//private List<Monster> monsters = new ArrayList<Monster>();
	public double[] location = new double[2];	
	/* Current User Singleton + Static Methods*/
	private static Player currentUser = null;
	

    public Monster getStartingMonster() {
        return starting_monster;
    }

    public void setStartingMonster(Monster startingMonster) {
        this.starting_monster = startingMonster;
    }

    
	public static void setCurrentUser(Player currentUser) {
		Player.currentUser = currentUser;
	}
	public static Player getCurrentUser() {
		if (currentUser == null) {
			// exec an asynchronous task
			
		}
		return currentUser;
	}
	

	public Player() {
	}

    public Player(Monster monster) {
        starting_monster = monster;
//        monsters.add(monster);
    }
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
//	public void addMonster(Monster monster) {
//		monsters.add(monster);
//	}
	
	public static Player createCurrentUser() {
		Player.currentUser = new Player();
		String udid = Config.getUdid();
		Player.currentUser.uuid = udid;
		return currentUser;
	}

//    public boolean isAnyoneThere() {
//        for (int x = 0; x < monsters.size(); x++)
//            if (monsters.get(x).isAlive())
//                return true;
//
//        // Return False if the for loop completes
//        return false;
//    }
	
	
}
