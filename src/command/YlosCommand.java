package command;

/** The Command for turning on the light - ConcreteCommand #1 */
public class YlosCommand implements Command {
    private Valkokangas valkokangas;

    public YlosCommand(Valkokangas v) {
        this.valkokangas = v;
    }

    @Override // Command
    public void execute() {
        valkokangas.ylos();
    }
}
