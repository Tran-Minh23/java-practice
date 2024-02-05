package LearnPatterns.DecoratorPattern.implementation;

import LearnPatterns.DecoratorPattern.interfaces.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}
