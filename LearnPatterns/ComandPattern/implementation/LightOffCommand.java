package LearnPatterns.ComandPattern.implementation;

import LearnPatterns.ComandPattern.interfaces.Command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        this.light.off();
    }

    public void undo() {
        this.light.on();
    }
}
