package model;
import model.Entity;

public class Apple extends Entity {
    @Override
    public String toString() {
        return "This is an apple with " + weight + " grams.";
    }
}
