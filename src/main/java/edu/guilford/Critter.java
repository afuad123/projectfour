package edu.guilford;

public abstract class Critter extends Creature {

    //ATTRIBUTES
    //foodNeed: a positive floating-point number that is the amount of food the object needs each day
    private float foodNeed;
    //foodEaten: a positive floating-point number that is the amount of food eaten so far in the day. It is set to zero when the object is initialized and at the beginning of each new day
    private float foodEaten;

    //GETTERS AND SETTERS
    /**
     * A getter for foodNeed
     * @return the current value of foodNeed (in g)
     */
    public float getFoodNeed() {
        return foodNeed;
    }
    //setter for foodNeed
    public void setFoodNeed(float foodNeed) {
        this.foodNeed = foodNeed;
    }

    //CONSTRUCTOR
    //constructor sets the values of size, rate, and foodNeed.
    public Critter(float size, float rate, float foodNeed) {
        super(size, rate);
        this.foodNeed = foodNeed;
        foodEaten = 0;
    }

    //METHODS
    //The class should override the method simulateDay. It should call simulateDay from the superclass and then add a condition that the Critter dies if the amount of food needed is less than the amount eaten in that day. If that condition is not true (the Critter is still alive), then the amount of food eaten should be set equal to zero.
    @Override
    public void simulateDay() {
        super.simulateDay();
        if (foodNeed > foodEaten) {
            die();
        } else {
            foodEaten = 0;
        }
    }

    //eat: a method that adds an amount to the value of foodEaten
    public void eat(float amount) {
        foodEaten += amount;
    }

    //stillNeed: a method with no parameters that returns the amount of food still needed (foodNeed - foodEaten)
    public float stillNeed() {
        return foodNeed - foodEaten;
    }

}

