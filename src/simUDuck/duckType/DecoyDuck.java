package simUDuck.duckType;

import simUDuck.Duck;
import simUDuck.duckBehavior.classes.fly.FlyNoWay;
import simUDuck.duckBehavior.classes.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {

    }
}
