package LearnPatterns.CompoundPattern.implementation;

import LearnPatterns.CompoundPattern.interfaces.Observer;
import LearnPatterns.CompoundPattern.interfaces.QuackObservable;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
