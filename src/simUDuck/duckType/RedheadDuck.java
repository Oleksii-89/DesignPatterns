package simUDuck.duckType;

import simUDuck.Duck;
import simUDuck.duckBehavior.classes.fly.FlyWithWings;
import simUDuck.duckBehavior.classes.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {

    }
}
