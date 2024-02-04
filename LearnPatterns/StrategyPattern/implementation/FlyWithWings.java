package LearnPatterns.StrategyPattern.implementation;

import LearnPatterns.StrategyPattern.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Im flying");
    }
    
}
