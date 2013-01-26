package com.bettername.thepokemonone.monster;

public enum MonsterNames {
	Pitbullfrog("Pitbullfrog"),
	Rihannocerous("Rihannocerous"),
	BradPitbull("BradPitbull")
	;

	private final String text;

	private MonsterNames(final String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}
}
