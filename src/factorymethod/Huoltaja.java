package factorymethod;

public class Huoltaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kahvi();
    };
    public Ruoka createRuoka(){
        return new Puuro();
    };
}
