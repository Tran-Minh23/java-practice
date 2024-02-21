package LearnPatterns.StatePattern.implementation;

import LearnPatterns.StatePattern.interfaces.State;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertQuarter'");
    }

    @Override
    public void ejectQuarter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ejectQuarter'");
    }

    @Override
    public void turnCrank() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnCrank'");
    }

    @Override
    public void dispense() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dispense'");
    }
    
}
