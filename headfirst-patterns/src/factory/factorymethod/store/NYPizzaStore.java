package factory.factorymethod.store;

import factory.factorymethod.Pizza;
import factory.factorymethod.ny_pizza.NYStyleCheesePizza;
import factory.factorymethod.ny_pizza.NYStyleClamPizza;
import factory.factorymethod.ny_pizza.NYStylePepperoniPizza;
import factory.factorymethod.ny_pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else
            return null;
    }

}
