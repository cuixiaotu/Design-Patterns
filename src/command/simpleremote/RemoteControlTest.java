package command.simpleremote;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);

        remote.buttonWasPressed();
        LighthOffCommand lightOffCommand = new LighthOffCommand(light);
        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();
    }
}
