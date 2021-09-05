package simUDuck.duckType;

import simUDuck.Duck;
import simUDuck.duckBehavior.classes.fly.FlyNoWay;
import simUDuck.duckBehavior.classes.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
