package LearnPatterns.CompoundPattern.implementation;

import LearnPatterns.CompoundPattern.interfaces.Observer;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;
  
    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }
  
    public void quack() {
        this.duck.quack();
        numberOfQuacks++;
    }
 
    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }
 }
