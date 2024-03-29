package LearnPatterns.ProxyPattern.implementation;

import LearnPatterns.StatePattern.implementation.HasQuarterState;
import LearnPatterns.StatePattern.implementation.NoQuarterState;
import LearnPatterns.StatePattern.implementation.SoldOutState;
import LearnPatterns.StatePattern.implementation.SoldState;

public class GumballMachine {
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
 
    State state = this.soldOutState;
    int count = 0;
    String location;
  
    public GumballMachine(String location, int numberGumballs) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        
        this.count = numberGumballs;
        this.location = location;

        if (numberGumballs > 0) {
            this.state = this.noQuarterState;
        } 
    }
  
    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (this.count != 0) {
            this.count = this.count - 1;
        }
    }

    State getHasQuarterState() {
        return this.hasQuarterState;
    }

    State getNoQuarterState() {
        return this.noQuarterState;
    }

    State getSoldState() {
        return this.soldState;
    }

    State getSoldOutState() {
        return this.soldOutState;
    }

    State getWinnerState() {
        return this.winnerState;
    }

    int getCount() {
        return this.count;
    }

    public String getLocation() {
        return this.location;
    }
}
