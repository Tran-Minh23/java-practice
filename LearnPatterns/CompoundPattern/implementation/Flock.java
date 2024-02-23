package LearnPatterns.CompoundPattern.implementation;

import java.util.ArrayList;
import java.util.Iterator;

import LearnPatterns.CompoundPattern.interfaces.Observer;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList();
    Observable observable;

    public Flock() {
        this.observable = new Observable(this);
    }
 
    public void add(Quackable quacker) {
        this.quackers.add(quacker);
    }
 
    public void quack() {
        Iterator iterator = this.quackers.iterator();

        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
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
