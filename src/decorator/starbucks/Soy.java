package decorator.starbucks;

public class Soy extends CondimentsDecorator {
    private static final String DESRIPTION = "Soy";
    private static final double COST = 0.15;

    public Soy(){
        this(null);
    }

    private Soy(Beverage beverage) { super(beverage); }

    @Override
    public String getDescription(){
        return super.getDescription() + ", " + DESRIPTION;
    }

    @Override
    public double getCost(){
        return super.getCost() + COST;
    }
}
