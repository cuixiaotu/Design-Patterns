package command.party;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("bed room");
        TV tv = new TV("living room");
        CeilingFan ceilingFan = new CeilingFan("living room");
        Stereo stereo = new Stereo("");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LighthOffCommand lighthOffCommand = new LighthOffCommand(light);
        TVOnCommand tvOnCommand = new TVOnCommand(tv);
        TVOffCommand tvOffCommand = new TVOffCommand(tv);

        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        Command[] partyOn = {lightOnCommand, tvOnCommand, ceilingFanHighCommand, stereoOnWithCDCommand};
        Command[] partyOff = {lighthOffCommand,  tvOffCommand,ceilingFanOffCommand,stereoOffCommand};

        MacroCommand macroOnCommand = new MacroCommand(partyOn);
        MacroCommand macroOffCommand = new MacroCommand(partyOff);

        remoteControl.setCommand(0,macroOnCommand,macroOffCommand);
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);

    }
}
