package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.RubberDuck;
import strategy.fly.FlyNoWay;

public class Main {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        // You can change the behavior at runtime
        mallardDuck.setFlyBehaviour(new FlyNoWay());
        System.out.println("After changing fly behavior:");
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();
    }
}
