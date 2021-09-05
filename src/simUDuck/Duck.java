package simUDuck;

import simUDuck.duckBehavior.interfaces.FlyBehavior;
import simUDuck.duckBehavior.interfaces.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public Duck(){

    }

//    public void quack() {}
    public void performQuack(){
        quackBehavior.quack();
    }
     public void swim(){
         System.out.println("All ducks float, even decoys!");
     }
//    public void fly(){}
    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
    //Other methods...

}
