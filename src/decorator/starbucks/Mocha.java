package decorator.starbucks;

public class Mocha extends CondimentsDecorator {
    private static final String DESRIPTION = "Mocha";
    private static final double COST = 0.20;

    Mocha(){
        this(null);
    }

    private Mocha(Beverage beverage) { super(beverage); }

    @Override
    public String getDescription(){
        return super.getDescription() + ", " + DESRIPTION;
    }

    @Override
    public double getCost(){
        return super.getCost() + COST;
    }
}
