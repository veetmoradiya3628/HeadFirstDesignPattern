package factory.factorymethod.chicago_pizza;

import factory.factorymethod.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
