package builder.burgers;

import builder.osat.Bun;
import builder.osat.BurgerPart;
import builder.osat.Patty;
import builder.osat.Sauce;

import java.util.ArrayList;

public class McDonaldsBurger {
    private ArrayList<BurgerPart> burger = new ArrayList();

    public void setSampyla(Bun sampyla) {
        burger.add(sampyla);
    }

    public void setKastike(Sauce kastike) {
        burger.add(kastike);
    }

    public void setPihvi(Patty pihvi) {
        burger.add(pihvi);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(BurgerPart osa : burger) {
            sb.append(osa.getNimi() + "\n");
        }
        return sb.toString();
    }
}
