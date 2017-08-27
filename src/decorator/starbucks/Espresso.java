package decorator.starbucks;

public class Espresso extends Beverage {
    private final String description;
    private final double cost;

    Espresso(){
        this.description = "Espresso";
        this.cost = 1.99;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return this.cost;
    }
}
