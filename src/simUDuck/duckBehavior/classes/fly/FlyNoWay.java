package simUDuck.duckBehavior.classes.fly;

import simUDuck.duckBehavior.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
