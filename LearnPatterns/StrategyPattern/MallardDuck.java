package LearnPatterns.StrategyPattern;

import LearnPatterns.StrategyPattern.implementation.FlyWithWings;
import LearnPatterns.StrategyPattern.implementation.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
    
}
