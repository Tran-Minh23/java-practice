package LearnPatterns.ComandPattern.implementation;

import LearnPatterns.ComandPattern.interfaces.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Nothing to do");
    }
    
}
