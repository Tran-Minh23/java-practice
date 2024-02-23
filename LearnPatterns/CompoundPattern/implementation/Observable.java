package LearnPatterns.CompoundPattern.implementation;

import java.util.ArrayList;
import java.util.Iterator;

import LearnPatterns.CompoundPattern.interfaces.QuackObservable;

public class Observable implements QuackObservable {
    ArrayList<Observer> observers = new ArrayList();
    QuackObservable duck;
 
    public Observable(QuackObservable duck) {
        this.duck = duck;
    }
  
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }
  
    public void notifyObservers() {
        Iterator iterator = this.observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer)iterator.next();
            observer.update(this.duck);
        }
    }
 }
