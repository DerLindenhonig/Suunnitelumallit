package strategy;

import java.util.List;

public class AfterEveryThirdItem implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String listString = "";

        for (int i = 0; i < list.size(); i++) {
            if((i + 1) % 3 == 0) {
                listString += list.get(i) + "\n";
            } else {
                listString += list.get(i) + " ";
            }
        }

        return listString;
    }
}
