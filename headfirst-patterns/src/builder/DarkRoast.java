package builder;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark roast chocolate";
    }

    @Override
    public double cost() {
        return .99;
    }

}
