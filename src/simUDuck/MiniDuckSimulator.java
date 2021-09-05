package simUDuck;

import simUDuck.duckBehavior.classes.fly.FlyRocketPowered;
import simUDuck.duckType.MallardDuck;
import simUDuck.duckType.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
