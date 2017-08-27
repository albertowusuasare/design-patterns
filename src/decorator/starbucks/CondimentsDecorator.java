package decorator.starbucks;

public abstract class CondimentsDecorator extends Beverage {
    private Beverage beverage;
    
    CondimentsDecorator(Beverage beverage){ this.beverage = beverage;}

    @Override
    public String getDescription(){ return (beverage != null) ? beverage.getDescription() : ""; }

    @Override
    public double getCost(){ return (beverage != null) ? this.beverage.getCost() : Double.MIN_VALUE;}

    public void setBeverage(Beverage beverage){ this.beverage = beverage; }
}
