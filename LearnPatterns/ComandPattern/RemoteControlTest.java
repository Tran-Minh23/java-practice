package LearnPatterns.ComandPattern;

import LearnPatterns.ComandPattern.implementation.GarageDoor;
import LearnPatterns.ComandPattern.implementation.GarageDoorOpenCommand;
import LearnPatterns.ComandPattern.implementation.Light;
import LearnPatterns.ComandPattern.implementation.LightOnCommand;
import LearnPatterns.ComandPattern.implementation.SimpleRemoteControl;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
