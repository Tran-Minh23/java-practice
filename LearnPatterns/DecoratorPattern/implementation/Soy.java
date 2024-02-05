package LearnPatterns.DecoratorPattern.implementation;

import LearnPatterns.DecoratorPattern.interfaces.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .20 + this.beverage.cost();
    }
}
