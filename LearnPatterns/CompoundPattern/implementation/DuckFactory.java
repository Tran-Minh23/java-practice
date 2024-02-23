package LearnPatterns.CompoundPattern.implementation;

import LearnPatterns.CompoundPattern.interfaces.AbstractDuckFactory;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class DuckFactory extends AbstractDuckFactory {
  
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
  
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
  
    public Quackable createDuckCall() {
        return new DuckCall();
    }
   
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
 }
