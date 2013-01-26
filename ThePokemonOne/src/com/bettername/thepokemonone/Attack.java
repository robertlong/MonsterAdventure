package com.bettername.thepokemonone;


public class Attack {
    private int id;
    private String name;
    private boolean special;
    private int speed;
    private int strength;
    private int minDamageRange;
    private int maxDamageRange;
    private float criticalPercent;
    private int[] specialEffect = null;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
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

    public float getCriticalPercent() {
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
