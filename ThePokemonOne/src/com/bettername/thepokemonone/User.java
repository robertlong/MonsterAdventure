package com.bettername.thepokemonone;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemonone.monster.Monster;

public class User {
	
	public String username;
	public String userID;
	public boolean isMale;
	public List<Item> items = new ArrayList<Item>();
	public List<Monster> monsters = new ArrayList<Monster>();
	
	/* Current User Singleton + Static Methods*/
	private static User currentUser = null;
	private static boolean isLoadingUser = false;
	
	public static void setCurrentUser(User currentUser) {
		User.currentUser = currentUser;
	}
	public static User getCurrentUser() {
		if (currentUser == null) {
			// exec an asynchronous task
			
		}
		return currentUser;
	}
	
	
	public User(String username, boolean isMale) {
		this.username = username;
		this.isMale = isMale;
	}
	
	
	public static void createCurrentUser(String username, boolean isMale) {
		User.currentUser = new User(username, isMale);
		String udid = Config.getUdid();
		User.currentUser.userID = udid;
	}
	

    public boolean isAnyoneThere() {
        for (int x = 0; x < monsters.size(); x++)
            if (monsters.get(x).isAlive())
                return true;

        // Return False if the for loop completes
        return false;
    }
	
	
}
