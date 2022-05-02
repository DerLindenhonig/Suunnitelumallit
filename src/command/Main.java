package command;

/** Testiluokka */
public class Main {
    public static void main(String[] args){
        Valkokangas valkokangas = new Valkokangas();
        Command ylosCmd = new YlosCommand(valkokangas);
        Command alasCmd = new AlasCommand(valkokangas);
        WallButton button1 = new WallButton(ylosCmd);
        WallButton button2 = new WallButton(alasCmd);
        button1.push();
        button2.push();
    }
}
