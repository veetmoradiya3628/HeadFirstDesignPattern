package factory.factorymethod;

import factory.factorymethod.store.ChicagoPizzaStore;
import factory.factorymethod.store.NYPizzaStore;
import factory.factorymethod.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza p = nyStore.createPizza("cheese");
        System.out.println("Veet ordered a : " + p.getName() + "\n");

        p = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + p.getName() + "\n");

        p = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + p.getName() + "\n");

        p = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + p.getName() + "\n");

        p = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + p.getName() + "\n");

        p = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + p.getName() + "\n");

        p = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + p.getName() + "\n");

        p = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + p.getName() + "\n");
    }
}
