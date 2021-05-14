package command.party;

public class TVOnCommand implements Command{
    TV tv;
    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
        tv.setInputChannel();
    }

    public void undo(){
        tv.off();
    }
}
