package com.bettername.thepokemonone.monster;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemoneone.model.Monster;
import com.bettername.thepokemonone.Attack;

public class Pitbullfrog extends Monster {
	
	public Pitbullfrog(String nickName) {
		super(nickName);
	}

	@Override
	public int getMaxHealth() {
		return 100;
	}

	@Override
	public List<Attack> getBaseAttacks() {
		final List<Attack> attacks = new ArrayList<Attack>();
		attacks.add(Attack.Swirly);
		attacks.add(Attack.Wedgie);
		return attacks;
	}

	@Override
	public String getName() {
		return MonsterNames.Pitbullfrog.toString();
	}
	
}
