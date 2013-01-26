package com.bettername.thepokemonone.monster;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemonone.Attack;
import com.bettername.thepokemonone.Item;

public abstract class Monster {
	
	private String nickName;
	private List<Attack> addedAttacks;
	private int currentHealth;
	private int exp;
	
	public abstract String getName();
	public abstract int getMaxHealth();
	public abstract List<Attack> getBaseAttacks();
	
	
	
	public Monster(String nickName) {
		this.nickName = nickName;
	}
	
	
	public List<Attack> getAddedAttacks() {
		return this.addedAttacks;
	}
	
	public List<Attack> getAllAttacks() {
		List <Attack> result = new ArrayList<Attack>();
		result.addAll(getBaseAttacks());
		result.addAll(getAddedAttacks());
		return result;
		
	}

	public String getNickname() {
		return this.nickName;
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
