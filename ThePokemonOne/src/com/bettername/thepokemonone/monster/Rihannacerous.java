package com.bettername.thepokemonone.monster;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemonone.Attack;
import com.bettername.thepokemonone.model.Monster;

public class Rihannacerous extends Monster {
	
	public Rihannacerous(String nickName) {
		super(nickName);
	}

	@Override
	public String getName() {
		return MonsterNames.Rihannocerous.toString();
	}

	@Override
	public int getMaxHealth() {
		return 31;
	}

	@Override
	public List<Attack> getBaseAttacks() {
		final List<Attack> attacks = new ArrayList<Attack>();
		attacks.add(Attack.Swirly);
		attacks.add(Attack.Wedgie);
		return attacks;
	}

	
	
}
