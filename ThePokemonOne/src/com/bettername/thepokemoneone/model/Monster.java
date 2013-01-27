package com.bettername.thepokemoneone.model;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemonone.Attack;
import com.bettername.thepokemonone.Item;

public abstract class Monster {
	
	private String id = "began monster";
	private String nickname;
	private List<Attack> addedAttacks;
	private int currentHealth;
	private int exp;
	
	public abstract String getName();
	public abstract int getMaxHealth();
	public abstract List<Attack> getBaseAttacks();
	
	public class WebMonster {
		String id;
		String nickname;
		public WebMonster(String id, String nickname) {
			this.id = id;
			this.nickname = nickname;
		}
	}
	
	
	
	public Monster(String nickName) {
		this.nickname = nickName;
	}
	
	public WebMonster getWebMonster() {
		return new WebMonster(this.id, nickname);
	}
	
	public List<Attack> getAddedAttacks() {
		return this.addedAttacks;
	}

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public List<Attack> getAllAttacks() {
		List <Attack> result = new ArrayList<Attack>();
		result.addAll(getBaseAttacks());
		result.addAll(getAddedAttacks());
		return result;
		
	}

    public boolean isAlive() {
        if (getCurrentHealth() > 0)
            return true;
        else
            return false;
    }

	public String getNickname() {
		return this.nickname;
	}
	public int getCurrentHealth() {
		return currentHealth;
	}
	public int getExp() {
		return exp;
	}
	public void addAttack(Attack attack) {
		this.addedAttacks.add(attack);
	}
	public void addExp(int addedExp) {
		this.exp += addedExp;
	}
	
	// methods
	public void attack(Attack attack, Monster monster) {
		
	}
	
	public void applyItem(Item item) {
		
	}
	
}
