package decorator.starbucks;

public class Decaf extends Beverage{
    private final String description;
    private final double cost;

    Decaf(){
        this.description = "Decaf";
        this.cost = 1.05;
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
