package decorator.starbucks;

public class Houseblend extends Beverage {
    private final String description;
    private final double cost;

    Houseblend(){
        this.description = "House Blend";
        this.cost = 0.89;
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
