package main;

import static constant.MaterialPrice.BASE_ESPRESSO;

public class PriceStrategyAmericano extends PriceStrategy {
    @Override
    public int price(Order order) {
        return BASE_ESPRESSO + shotFor(order) + sizeFor(order);
    }
}
