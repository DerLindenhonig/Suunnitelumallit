package command;

/** The Command for turning off the light - ConcreteCommand #2 */
public class AlasCommand implements Command {
    private Valkokangas valkokangas;

    public AlasCommand(Valkokangas v) {
        this.valkokangas = v;
    }

    @Override // Command
    public void execute() {
        valkokangas.alas();
    }
}
