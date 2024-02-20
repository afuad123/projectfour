package edu.guilford;

public class Plant extends Creature {

    //CONSTRUCTOR
    //The constructor sets the values of size and rate.
    public Plant(float size, float rate) {
        super(size, rate);
    }

    //METHODS
    //chewedOn: the size of this object is decreased by a specified amount. The amount cannot exceed the current size of the object.
    public void chewedOn(float amount) {
        //if the amount is greater than the size, then the size is set to zero
        if (amount > size) {
            size = 0;
        } else {
            size -= amount;
        }
    }

    //toString
    @Override
    public String toString() {
        return "Plant: size = " + size + "g, rate = " + rate + "g/day, alive = " + alive + ", age = " + age + " days";
    }

}
