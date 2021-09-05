package simUDuck.duckType;

import simUDuck.Duck;
import simUDuck.duckBehavior.classes.fly.FlyNoWay;
import simUDuck.duckBehavior.classes.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {

    }
}
