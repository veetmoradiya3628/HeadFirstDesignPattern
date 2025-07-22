package factory.abstract_factory.ingredient_factory;

import factory.abstract_factory.base_ingredients.Cheese;
import factory.abstract_factory.base_ingredients.Clams;
import factory.abstract_factory.base_ingredients.Dough;
import factory.abstract_factory.base_ingredients.Pepperoni;
import factory.abstract_factory.base_ingredients.Sauce;
import factory.abstract_factory.base_ingredients.Veggies;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
