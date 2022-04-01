package strategy;

import java.util.Iterator;
import java.util.List;

public class AfterEveryOtherItem implements ListConverter {

    @Override
    public String listToString(List<String> list) {
        String listString = "";

        String[] a = list.toArray(new String[0]);

        for(int i = 0; i < a.length; i++) {
            if((i + 1) % 2 == 0) {
                listString += a[i] + "\n";
            } else {
                listString += a[i] + " ";
            }
        }
        return listString;
    }
}
