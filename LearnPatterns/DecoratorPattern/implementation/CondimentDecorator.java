package LearnPatterns.DecoratorPattern.implementation;

import LearnPatterns.DecoratorPattern.interfaces.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
