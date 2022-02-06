package main;

import static constant.Size.*;

public class Cafe {
    public static void main(String[] args) {
        Order order = new Order(true, false, false, 1, SMALL);
        order.show();
        System.out.println(order.price());
    }
}
