package LearnPatterns.CompoundPattern;

import LearnPatterns.CompoundPattern.implementation.CountingDuckFactory;
import LearnPatterns.CompoundPattern.implementation.Flock;
import LearnPatterns.CompoundPattern.implementation.Goose;
import LearnPatterns.CompoundPattern.implementation.GooseAdapter;
import LearnPatterns.CompoundPattern.implementation.QuackCounter;
import LearnPatterns.CompoundPattern.implementation.Quackologist;
import LearnPatterns.CompoundPattern.interfaces.AbstractDuckFactory;
import LearnPatterns.CompoundPattern.interfaces.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }
  
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
 
        System.out.println("\nDuck Simulator");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);
        
        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        this.simulate(flockOfDucks);
        
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        this.simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");

        System.out.println("\nDuck Simulator: With Observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
    }
   
    void simulate(Quackable duck) {
        duck.quack();
    }
}
