package LearnPatterns.CompoundPattern.implementation;

import java.util.ArrayList;
import java.util.Iterator;

import LearnPatterns.CompoundPattern.interfaces.Observer;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList();

    public Flock() {
    
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
        Iterator iterator = this.quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
