package LearnPatterns.CompoundPattern.implementation;

import LearnPatterns.CompoundPattern.interfaces.Observer;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks = 0;
  
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
        this.duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.duck.notifyObservers();
    }
 }
