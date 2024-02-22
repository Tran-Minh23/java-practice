package LearnPatterns.ProxyPattern.implementation;

public class GumballMonitor {
    GumballMachine machine;
 
    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }
 
    public void report() {
        System.out.println("Gumball Machine: " + this.machine.getLocation());
        System.out.println("Current inventory: " + this.machine.getCount() + " gumballs");
        System.out.println("Current state: " + this.machine.getState());
    }
 }
