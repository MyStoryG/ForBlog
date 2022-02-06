package main;

import static constant.MaterialPrice.*;

public abstract class PriceStrategy {
    abstract int price(Order order);

    int shotFor(Order order) {
        return DEFAULT_SHOT * order.getShot();
    }

    int sizeFor(Order order) {
        return DEFAULT_SIZE * order.getSize();
    }
}
