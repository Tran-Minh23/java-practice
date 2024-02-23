package LearnPatterns.CompoundPattern.implementation;

import LearnPatterns.CompoundPattern.interfaces.Observer;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        this.observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        this.notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    public void notifyObservers() {
        this.observable.notifyObservers();
    }
}
