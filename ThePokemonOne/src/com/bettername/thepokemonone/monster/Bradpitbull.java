package com.bettername.thepokemonone.monster;

import java.util.ArrayList;
import java.util.List;

import com.bettername.thepokemonone.model.Attack;
import com.bettername.thepokemonone.model.Monster;

public class Bradpitbull extends Monster{

	public Bradpitbull(String nickName) {
		super(nickName);
	}

	@Override
	public String getName() {
		return MonsterNames.BradPitbull.toString();
	}

	@Override
	public int getMaxHealth() {
		return 14;
	}

	@Override
	public List<Attack> getBaseAttacks() {
		final List<Attack> attacks = new ArrayList<Attack>();
		attacks.add(Attack.SuckerPunch);
		attacks.add(Attack.PurpleNurple);
		return attacks;
	}
	

}
