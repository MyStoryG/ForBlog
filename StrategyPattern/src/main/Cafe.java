package main;

import static constant.Size.*;

public class Cafe {
    public static void main(String[] args) {
        Order order1 = Order.americano(1, SMALL);
        order1.show();
        System.out.println(order1.price());

        order1 = Order.icedAmericano(1, SMALL);
        order1.show();
        System.out.println(order1.price());

        Order order2 = Order.icedAmericano(1, SMALL);
        order2.show();
        System.out.println(order2.price());

        Order order3 = Order.icedLatte(1, SMALL);
        order3.show();
        System.out.println(order3.price());

        Order order4 = Order.icedVanillaLatte(1, SMALL);
        order4.show();
        System.out.println(order4.price());
    }
}