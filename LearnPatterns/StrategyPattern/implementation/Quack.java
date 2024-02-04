package LearnPatterns.StrategyPattern.implementation;

import LearnPatterns.StrategyPattern.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
