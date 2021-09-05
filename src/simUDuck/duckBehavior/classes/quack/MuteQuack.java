package simUDuck.duckBehavior.classes.quack;

import simUDuck.duckBehavior.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
