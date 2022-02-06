package main;

public class Order {
    private boolean ice;
    private boolean milk;
    private boolean vanillaSyrup;
    private int shot;
    private int size;
    private PriceStrategy priceStrategy;

    Order(boolean ice, boolean milk, boolean vanillaSyrup, int shot, int size, PriceStrategy priceStrategy) {
        this.ice = ice;
        this.milk = milk;
        this.vanillaSyrup = vanillaSyrup;
        this.shot = shot;
        this.size = size;
        this.priceStrategy = priceStrategy;
    }

    public static Order americano(int shot, int size) {
        return new Order(false, false, false, shot, size, new PriceStrategyAmericano());
    }

    public static Order icedAmericano(int shot, int size) {
        return new Order(true, false, false, shot, size, new PriceStrategyIcedAmericano());
    }

    public static Order icedLatte(int shot, int size) {
        return new Order(true, true, false, shot, size, new PriceStrategyIcedLatte());
    }

    public static Order icedVanillaLatte(int shot, int size) {
        return new Order(true, true, true, shot, size, new PriceStrategyIcedVanillaLatte());
    }


    public int price() {
        return priceStrategy.price(this);
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

    int getShot() {
        return shot;
    }

    int getSize() {
        return size;
    }
}
