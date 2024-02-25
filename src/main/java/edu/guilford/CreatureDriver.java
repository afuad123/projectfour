package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

public class CreatureDriver {
    public static void main(String[] args) {
        Random rand = new Random();

        //TEST 1
        //Instantiate a list that contains 2000 Plant objects, each with a size of 300±50 grams and a growth rate of 5 grams/day.
        ArrayList<Plant> plants = new ArrayList<Plant>();
        for (int i = 0; i < 2000; i++) {
            int randsize = rand.nextInt(100) + 250;
            plants.add(new Plant(randsize, 5));
        }

        //Instantiate one PlantEater object with a size of 1000±100 grams, a growth rate of 3 grams/day and a food need of 50 grams/day.
        PlantEater plantEater1 = new PlantEater(1000, 3, 50, plants.toArray(new Plant[plants.size()]));
        PlantEater plantEater2 = new PlantEater(1000, 3, 50, plants.toArray(new Plant[plants.size()]));

        //Test methods from the plantEater class
        //Tests using plantEater1 show that the methods from the class work as expected
        //Tests using plantEater 2 show the effects of the simulateDay method
        // System.out.println("TEST 1: Day in the life of a plant eater, without simulateDay(): ");
        // System.out.println("Is the plantEater object alive? " + plantEater1.isAlive());
        // System.out.println("The plantEater object's size is " + plantEater1.getSize() + "g");
        // System.out.println("The plantEater object's growth rate is " + plantEater1.getRate() + "g/day");
        // System.out.println("The plantEater object's food need is " + plantEater1.getFoodNeed() + "g/day");
        // System.out.println("The plantEater object's age is " + plantEater1.getAge() + " days");
        // System.out.println("The plantEater object still needs " + plantEater1.stillNeed() + "g of food to survive");
        // System.out.println("The plantEater object is now eating a plant");
        // plantEater1.chew(plants.get(0));
        // System.out.println("The total size of the plant object that was chewed on is " + plants.get(0).getSize() + "g");
        // System.out.println("The plantEater object ate " + plantEater1.getFoodEaten() + "g of the plant");
        // System.out.println("The plantEater object's size is now " + plantEater1.getSize() + "g");
        // System.out.println("The plantEater object still needs " + plantEater1.stillNeed() + "g of food");

        // System.out.println("\nTEST 1: Day in the life of a plant eater, with simulateDay(): ");
        // System.out.println("Is the plantEater object alive? " + plantEater2.isAlive());
        // System.out.println("The plantEater object's size is " + plantEater2.getSize() + "g");
        // System.out.println("The plantEater object's growth rate is " + plantEater2.getRate() + "g/day");
        // System.out.println("The plantEater object's food need is " + plantEater2.getFoodNeed() + "g/day");
        // System.out.println("The plantEater object's age is " + plantEater2.getAge() + " days");
        // System.out.println("The plantEater object still needs " + plantEater2.stillNeed() + "g of food to survive");
        // System.out.println("The plantEater object is now simulating a day");
        // plantEater2.simulateDay();
        // System.out.println("The plantEater object's size is now " + plantEater2.getSize() + "g");
        // System.out.println("The plantEater object's age is now " + plantEater2.getAge() + " days");

        //TEST 2
        

    
        


    }

    //METHODS
    /**
     * Evaluates a list of creatures to determine if any are still alive
     * @param creatures an ArrayList of Creature objects (a Plant or Critter object)
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
     * @param creatures an ArrayList of Creature objects (a Plant or Critter object)
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