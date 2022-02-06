package main;

import static constant.MaterialPrice.BASE_ESPRESSO;
import static constant.MaterialPrice.ICE;

public class PriceStrategyIcedAmericano extends PriceStrategy {
    @Override
    public int price(Order order) {
        return BASE_ESPRESSO + ICE + shotFor(order) + sizeFor(order);
    }
}
