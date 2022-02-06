package main;

import static constant.MaterialPrice.*;

public class PriceStrategyIcedVanillaLatte extends PriceStrategy {
    @Override
    public int price(Order order) {
        return BASE_ESPRESSO + ICE + MILK + VANILLA_SYRUP + shotFor(order) + sizeFor(order);
    }
}
