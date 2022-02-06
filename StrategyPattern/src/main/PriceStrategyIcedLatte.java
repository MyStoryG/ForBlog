package main;

import static constant.MaterialPrice.*;

public class PriceStrategyIcedLatte extends PriceStrategy {
    @Override
    public int price(Order order) {
        return BASE_ESPRESSO + ICE + MILK + shotFor(order) + sizeFor(order);
    }
}
