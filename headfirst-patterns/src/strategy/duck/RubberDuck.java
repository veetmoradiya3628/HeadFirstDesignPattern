package strategy.duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super();
        this.setQuackBehaviour(() -> System.out.println("Squeak"));
        this.setFlyBehaviour(() -> System.out.println("I can't fly"));
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void swim() {
        System.out.println("Rubber ducks float on water!");
    }

}
