package com.bettername.thepokemonone;

/*

This class will access the current user singleton

*/

import java.util.Random;

import com.bettername.thepokemonone.model.Monster;
import com.bettername.thepokemonone.model.Player;

public class Battle {

    public int turnNumber;
    public Player opponent;
    public Player currentUser;

    public Battle(Player currentUser, Player opponent) {
        this.currentUser = currentUser;
        this.opponent = opponent;

    }

    public Battle(Player currentUser, Monster wildMonster) {
        opponent = new Player(wildMonster);
        this.currentUser = currentUser;
    }

    private void attack(Attack attack, Monster reciever) {
        Random rand = new Random();
        int attackDamage = rand.nextInt(attack.getMaxDamageRange())+attack.getMinDamageRange();
        reciever.setCurrentHealth(reciever.getCurrentHealth()-attackDamage);
    }

    private void aiAttack(Monster computer) {
        Random rand = new Random();
        float hitChance = rand.nextFloat();
        if (hitChance > 0.2)  {
            int attackSlot = rand.nextInt(computer.getAllAttacks().size());
            attack(computer.getAttack(attackSlot), currentUser.getStartingMonster());
        }
    }

//    private void turn() {
//        if (!currentUser.isAnyoneThere()) {
//            declareWinner(opponent);
//        } else if (!opponent.isAnyoneThere()) {
//            declareWinner(currentUser);
//        } else {
//            // Continue turn logic
//            turnNumber++;
//        }
//    }

    private void run() {
        declareWinner(null);
    }

    private void declareWinner(Player winner) {
        if (winner != null) {
            Monster expUpMonst = winner.getStartingMonster();
            expUpMonst.addExp(20);
        }
    }


    private boolean isBattleComplete() {
        return false;
    }

}
