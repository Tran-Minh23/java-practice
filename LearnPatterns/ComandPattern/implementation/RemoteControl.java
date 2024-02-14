package LearnPatterns.ComandPattern.implementation;

import LearnPatterns.ComandPattern.interfaces.Command;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");

        for (int i = 0; i < this.onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + this.onCommands[i].getClass().getName()
            + " " + this.offCommands[i].getClass().getName() + "\n");
        }
        
        return stringBuff.toString();
    }
}
