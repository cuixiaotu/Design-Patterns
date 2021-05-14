package command.party;

public class LighthOffCommand implements Command {
    Light light;
    public LighthOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
