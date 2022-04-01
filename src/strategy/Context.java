package strategy;

import java.util.List;

public class Context {
    private ListConverter listConverter;

    public Context(ListConverter listConverter) {
        this.listConverter = listConverter;
    }

    public void printList(List<String> list) {
        System.out.println(listConverter.listToString(list));
    }
}
