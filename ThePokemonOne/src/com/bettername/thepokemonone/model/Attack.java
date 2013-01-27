package com.bettername.thepokemonone.model;


public enum Attack {
	SuckerPunch("Sucker Punch", false, 10, 10, .2),
	FireBlast("Fire Blast", false, 10, 10, .2),
	PurpleNurple("Purple Nurple", false, 10, 10, .2),
	Swirly("Swirly", false, 10, 10, .2),
	Wedgie("Wedgie", false, 10, 10, .2)
	;


	static int count;
    private int id;
    private String name;
    private boolean special;
    private int speed;
    private int strength;
    private int minDamageRange;
    private int maxDamageRange;
    private double criticalPercent;
    private int[] specialEffect = null;

    private Attack(String name, boolean special, int speed, int strength, double criticalPercent) {
    	this.name = name;
    	this.special = special;
    	this.speed = speed;
    	this.strength = strength;
    	this.criticalPercent = criticalPercent;
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getDamageRange() {
        return getMaxDamageRange()-getMinDamageRange();
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMinDamageRange() {
        return minDamageRange;
    }

    public void setMinDamageRange(int minDamageRange) {
        this.minDamageRange = minDamageRange;
    }

    public int getMaxDamageRange() {
        return maxDamageRange;
    }

    public void setMaxDamageRange(int maxDamageRange) {
        this.maxDamageRange = maxDamageRange;
    }

    public double getCriticalPercent() {
        return criticalPercent;
    }

    public void setCriticalPercent(float criticalPercent) {
        this.criticalPercent = criticalPercent;
    }

    public int[] getSpecialEffect() {
        return specialEffect;
    }

    public void setSpecialEffect(int[] specialEffect) {
        this.specialEffect = specialEffect;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }
}
