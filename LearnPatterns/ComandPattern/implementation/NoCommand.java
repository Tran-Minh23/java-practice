package LearnPatterns.ComandPattern.implementation;

import LearnPatterns.ComandPattern.interfaces.Command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Nothing to do");
    }

    @Override
    public void undo() {
        System.out.println("undo");
    }
    
}
