package builder.coffees;

import builder.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark roast chocolate";
    }

    @Override
    public double cost() {
        return .99;
    }

}
