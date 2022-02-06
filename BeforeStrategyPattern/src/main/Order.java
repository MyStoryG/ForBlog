package main;

import static constant.MaterialPrice.*;

public class Order {
    private boolean ice;
    private boolean milk;
    private boolean vanillaSyrup;
    private int shot;
    private int size;

    Order(boolean ice, boolean milk, boolean vanillaSyrup, int shot, int size) {
        this.ice = ice;
        this.milk = milk;
        this.vanillaSyrup = vanillaSyrup;
        this.shot = shot;
        this.size = size;
    }

    public int price() {
        if (!ice && !milk && !vanillaSyrup) {
            return BASE_ESPRESSO + shot() + size();
        }
        if (ice && !milk && !vanillaSyrup) {
            return BASE_ESPRESSO + ICE + shot() + size();
        }
        if (ice && milk && !vanillaSyrup) {
            return BASE_ESPRESSO + ICE + MILK + shot() + size();
        }
        if (ice && milk && vanillaSyrup) {
            return BASE_ESPRESSO + ICE + MILK + VANILLA_SYRUP + shot() + size();
        }
        return 0;
    }

    private int shot() {
        return DEFAULT_SHOT * shot;
    }

    private int size() {
        return DEFAULT_SIZE * size;
    }

    public void show() {
        if (!ice && !milk && !vanillaSyrup) {
            System.out.println("Americano");
        } else if (ice && !milk && !vanillaSyrup) {
            System.out.println("Iced Americano");
        } else if (ice && milk && !vanillaSyrup) {
            System.out.println("Iced Latte");
        } else if (ice && milk && vanillaSyrup) {
            System.out.println("Iced Vanilla Latte");
        }
    }
}
