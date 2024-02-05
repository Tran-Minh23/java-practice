package LearnPatterns.StrategyPattern;

import LearnPatterns.StrategyPattern.implementation.FlyNoWay;
import LearnPatterns.StrategyPattern.implementation.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I’m a model duck");
    }
}
