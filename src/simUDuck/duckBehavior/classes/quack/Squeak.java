package simUDuck.duckBehavior.classes.quack;

import simUDuck.duckBehavior.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
