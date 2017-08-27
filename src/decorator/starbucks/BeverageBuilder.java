package decorator.starbucks;

class BeverageBuilder {
    private Beverage beverage;

    BeverageBuilder(Beverage baseBeverage){
        this.beverage = baseBeverage;
    }

    BeverageBuilder addCondiment(CondimentsDecorator condimentsDecorator){
        condimentsDecorator.setBeverage(this.beverage);
        this.beverage = condimentsDecorator;
        return this;
    }

    Beverage build(){ return this.beverage; }
}
