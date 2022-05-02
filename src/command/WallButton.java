package command;

/** Invoker */
public class WallButton {
    Command command;
    public WallButton(Command cmd){
        this.command = cmd;
    }
    public void push() {
        command.execute();
    }
}
