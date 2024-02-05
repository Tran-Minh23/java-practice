package LearnPatterns.DecoratorPattern.implementation;

import LearnPatterns.DecoratorPattern.interfaces.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .20 + this.beverage.cost();
    }
}
