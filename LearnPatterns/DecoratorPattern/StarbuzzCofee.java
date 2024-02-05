package LearnPatterns.DecoratorPattern;

import LearnPatterns.DecoratorPattern.implementation.Espresso;
import LearnPatterns.DecoratorPattern.implementation.Mocha;
import LearnPatterns.DecoratorPattern.implementation.Whip;
import LearnPatterns.DecoratorPattern.interfaces.Beverage;

public class StarbuzzCofee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
