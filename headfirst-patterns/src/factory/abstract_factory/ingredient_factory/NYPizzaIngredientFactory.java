package factory.abstract_factory.ingredient_factory;

import factory.abstract_factory.base_ingredients.Cheese;
import factory.abstract_factory.base_ingredients.Clams;
import factory.abstract_factory.base_ingredients.Dough;
import factory.abstract_factory.base_ingredients.Pepperoni;
import factory.abstract_factory.base_ingredients.Sauce;
import factory.abstract_factory.base_ingredients.Veggies;
import factory.abstract_factory.ingredients.FreshClams;
import factory.abstract_factory.ingredients.Garlic;
import factory.abstract_factory.ingredients.MarinaraSauce;
import factory.abstract_factory.ingredients.Mushroom;
import factory.abstract_factory.ingredients.Onion;
import factory.abstract_factory.ingredients.RedPepper;
import factory.abstract_factory.ingredients.ReggianoCheese;
import factory.abstract_factory.ingredients.SlicedPepperoni;
import factory.abstract_factory.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }

}
