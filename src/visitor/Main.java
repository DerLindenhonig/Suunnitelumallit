package visitor;

public class Main {
    public static void main(String[] args) {
        IVisitor visitor = new Visitor();
        Character character = new Character(visitor);
        character.fight();
    }
}
