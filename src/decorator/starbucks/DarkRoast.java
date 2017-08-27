package decorator.starbucks;

public class DarkRoast extends Beverage {
    private final String description;
    private final double cost;

     DarkRoast(){
        this.description = "Dark Roast";
        this.cost = 0.99;
    }

    @Override
    public String getDescription() { return this.description; }

    @Override
    public double getCost() {
        return this.cost;
    }
}
