package strategy.duck;

import strategy.fly.FlyBehaviour;
import strategy.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public void display() {
        System.out.println("Displaying the duck.");
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
