package command.party;

public class MacroCommand implements Command{
    Command[] commands;
    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    @Override
    /*
    * 按照倒序执行
    * */
    public void undo() {
        for (int i = commands.length-1; i >=0; i--) {
            commands[i].undo();
        }
    }
}
