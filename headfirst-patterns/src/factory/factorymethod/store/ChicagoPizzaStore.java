package factory.factorymethod.store;

import factory.factorymethod.Pizza;
import factory.factorymethod.chicago_pizza.ChicagoStyleCheesePizza;
import factory.factorymethod.chicago_pizza.ChicagoStyleClamPizza;
import factory.factorymethod.chicago_pizza.ChicagoStylePepperoniPizza;
import factory.factorymethod.chicago_pizza.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else
            return null;
    }

}
