package decorator.starbucks;

public class Milk extends CondimentsDecorator {
    private static final String DESRIPTION = "Milk";
    private static final double COST = 0.10;

    public Milk(){
        this(null);
    }

    private Milk(Beverage beverage) { super(beverage); }

    @Override
    public String getDescription(){
       return super.getDescription() + ", " + DESRIPTION;
    }

    @Override
    public double getCost(){
        return super.getCost() + COST;
    }

}
