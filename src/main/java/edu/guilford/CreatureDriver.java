package edu.guilford;

import java.util.ArrayList;

public class CreatureDriver {
    public static void main(String[] args) {
        


    }

    //METHODS
    /**
     * Evaluates a list of creatures to determine if any are still alive
     * @param creatures an ArrayList of Creature objects
     * @return "true" if any Creature object in the list is alive and "false" otherwise
     */
    public static boolean stillAlive(ArrayList<? extends Creature> creatures) {
        for (Creature creature : creatures) {
            if (creature.isAlive()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Evaluates a list of creatures to determine the total mass of all the creatures in grams
     * @param creatures an ArrayList of Creature objects
     * @return the total mass of all the creatures in the list
     */
    public static double totalMass(ArrayList<? extends Creature> creatures) {
        double total = 0;
        for (Creature creature : creatures) {
            total += creature.getSize();
        }
        return total;
    }
}