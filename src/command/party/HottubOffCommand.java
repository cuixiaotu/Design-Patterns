package command.party;

public class HottubOffCommand {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }
    public void undo() {
        hottub.on();
    }
}
