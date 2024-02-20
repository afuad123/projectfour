package edu.guilford;

import java.util.Random;

public class PlantEater extends Critter {

    //ATTRIBUTES
    //a list of Plant objects that it may chew on.
    private Plant[] plants;
    private Random rand = new Random();

    //CONSTRUCTOR
    //The constructor sets the value of size, rate, foodNeed, and the list of Plant objects.
    public PlantEater(float size, float rate, float foodNeed, Plant[] plants) {
        super(size, rate, foodNeed);
        this.plants = plants;
    }


    //METHODS
    //chew: This objects eats part of a specified Plant object. The amount it chews is random, but cannot exceed half of the size of the Plant, 
    //the amount the object needs (according to its stillNeedattribute) or 10% of the daily need of the object (according to its foodNeed attribute.) 
    //If these conditions are not satisfied, this method should exit.
    public void chew(Plant plant) {
        float amount = rand.nextFloat() * plant.getSize() / 2;
        if (amount > stillNeed()) {
            amount = stillNeed();
        }
        if (amount > getFoodNeed() / 10) {
            amount = getFoodNeed() / 10;
        }
        plant.chewedOn(amount);
        eat(amount);
    }

    //The class overrides the value of simulateDay. It first decides on how many plants it gets to chew on that day. That value should be randomly chosen, 
    //and between 0.5% and 2% of the current number of plants available to the object. Each plant it chews on is then chosen randomly (and it can chew on the 
    //same plant more than once in the same day). After it chews on all the plants, it calls the simuilateDaymethod of the super class.
    @Override
    public void simulateDay() {
        int numPlants = (int) (plants.length * (rand.nextFloat() * 0.2 + 0.005));
        for (int i = 0; i < numPlants; i++) {
            chew(plants[rand.nextInt(plants.length)]);
        }
        super.simulateDay();
    }

    //toString
    //Rreturn a string that includes the size, rate, foodNeed, and the number of plants available to the object (with units)
    @Override
    public String toString() {
        return "PlantEater: size = " + getSize() + "g, rate = " + getRate() + "g/day, foodNeed = " + getFoodNeed() + "g/day, plants = " + plants.length;
    }

}
