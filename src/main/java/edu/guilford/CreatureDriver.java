package edu.guilford;

import java.util.ArrayList;

public class CreatureDriver {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    //METHODS
    //stillAlive should have one parameter: a list of Creature objects. It should return true if any Creature object in the list is alive and false otherwise.
    //public static boolean stillAlive(ArrayList<? extends Creature> creatures) is the correct signature
    public static boolean stillAlive(ArrayList<? extends Creature> creatures) {
        for (Creature creature : creatures) {
            if (creature.isAlive()) {
                return true;
            }
        }
        return false;
    }

    //totalMass should have one parameter: a list of Creature objects. It should return the total mass of the objects in the list.
    //public static double totalMass(ArrayList<? extends Creature> creatures) is the correct signature
    public static double totalMass(ArrayList<? extends Creature> creatures) {
        double total = 0;
        for (Creature creature : creatures) {
            total += creature.getSize();
        }
        return total;
    }
}