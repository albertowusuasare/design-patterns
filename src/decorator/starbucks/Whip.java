package decorator.starbucks;

public class Whip extends CondimentsDecorator {
    private static final String DESRIPTION = "Whip";
    private static final double COST = 0.10;

    Whip(){
        this(null);
    }

    private Whip(Beverage beverage) { super(beverage); }

    @Override
    public String getDescription(){
        return super.getDescription() + ", " + DESRIPTION;
    }

    @Override
    public double getCost(){
        return super.getCost() + COST;
    }
}
