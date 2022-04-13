package builder;

import builder.builders.HesburgerBuilder;
import builder.builders.McDonaldsBuilder;
import builder.burgers.HesburgerBurger;
import builder.burgers.McDonaldsBurger;

public class Customer {
    /* A customer ordering a pizza. */
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcDonaldsBuilder = new McDonaldsBuilder();

        System.out.println("Hesburger hampurilainen:");
        waiter.setBurgerBuilder(hesburgerBuilder);
        waiter.constructBurger();
        HesburgerBurger burger = hesburgerBuilder.getBurger();
        System.out.println(burger);

        System.out.println("McDonalds hampurilainen:");
        waiter.setBurgerBuilder(mcDonaldsBuilder);
        waiter.constructBurger();
        McDonaldsBurger burger2 = mcDonaldsBuilder.getBurger();
        System.out.println(burger2);
    }
}
