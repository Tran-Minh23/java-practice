package LearnPatterns.AdapterPattern.implementation;

import LearnPatterns.AdapterPattern.interfaces.Duck;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
