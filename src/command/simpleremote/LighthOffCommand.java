package command.simpleremote;

public class LighthOffCommand implements Command{
    Light light;
    public LighthOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
