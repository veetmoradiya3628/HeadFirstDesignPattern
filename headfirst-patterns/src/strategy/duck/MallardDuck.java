package strategy.duck;

import strategy.fly.FlyWithWings;
import strategy.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
        this.setQuackBehaviour(new Quack());
        this.setFlyBehaviour(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
