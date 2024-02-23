package LearnPatterns.CompoundPattern.implementation;

import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
