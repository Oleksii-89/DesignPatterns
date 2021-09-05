package simUDuck.duckType;

import simUDuck.Duck;
import simUDuck.duckBehavior.classes.fly.FlyWithWings;
import simUDuck.duckBehavior.classes.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
