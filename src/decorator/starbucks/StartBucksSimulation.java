package decorator.starbucks;



public class StartBucksSimulation {

    public static void main(String [] args){
        Beverage espressoNoCondiments = new BeverageBuilder(new Espresso()).build();
        displayOrder(espressoNoCondiments);
        Beverage doubleMochaWhip = new BeverageBuilder(new DarkRoast()).addCondiment(new Mocha())
                                                                       .addCondiment(new Mocha())
                                                                       .addCondiment(new Whip())
                                                                       .build();
        displayOrder(doubleMochaWhip);
    }

    private static void displayOrder(Beverage beverage){
        System.out.println(" ---------------------------------------------------------------------------------------- ");
        System.out.println("Description: " + beverage.getDescription() + "\nCost: " + beverage.getCost() );
    }
}
