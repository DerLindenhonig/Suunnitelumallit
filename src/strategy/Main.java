package strategy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = List.of("yksi", "kaksi", "kolme", "nelja", "viisi", "kuusi", "seitsemän", "kahdeksan");

        System.out.println("1:");

        Context context = new Context((new AfterEachItem()));
        context.printList(list);

        System.out.println("2:");

        Context context2 = new Context((new AfterEveryOtherItem()));
        context2.printList(list);

        System.out.println("3:");

        Context context3 = new Context((new AfterEveryThirdItem()));
        context3.printList(list);
    }
}
