package edu.guilford;

import java.util.Random;

public class MeatEater extends Critter {

    //ATTRIBUTES
    //The class should have an attribute that is a list of available PlantEater objects it can chase and eat.
    private PlantEater[] plantEaters;
    private Random rand = new Random();

    //CONSTRUCTOR
    public MeatEater(float size, float rate, float foodNeed) {
        super(size, rate, foodNeed);
        
    }

    //METHODS
    @Override
    public void simulateDay() {
        //a meat eater object can chase one or two plant eater objects a day
        int numChases = (rand.nextInt() * 2 + 1);
        for (int i = 0; i < numChases; i++) {
            //it has a specified probability of catching the plant eater object
            if (rand.nextFloat() < 0.5) {
                //if it does so, the meat eater will use its eat method with the current mass of the plant eater object
                eat(plantEaters[rand.nextInt(plantEaters.length)].getSize());
                //the plant eater object will then invoke its die method
                plantEaters[rand.nextInt(plantEaters.length)].die();
            }
            
        }
        super.simulateDay();
    }



}
