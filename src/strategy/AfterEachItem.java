package strategy;

import java.util.Iterator;
import java.util.List;

public class AfterEachItem implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String listString = "";

        Iterator<String> i = list.iterator();

        while(i.hasNext()) {
            listString += i.next() + "\n";
        }
        return listString;
    }
}
