package LearnPatterns.ComandPattern.implementation;

import LearnPatterns.ComandPattern.interfaces.Command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
   }
