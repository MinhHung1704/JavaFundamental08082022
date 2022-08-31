package oop.abstraction;

public class PizzaCheese extends Pizza {
    public PizzaCheese(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Pizza Cheese Prepare ");
    }

    @Override
    void sauce() {
        System.out.println("Pizza Cheese Sauce ");
    }

    @Override
    void bake() {
        System.out.println("Pizza Cheese Bake ");
    }

    @Override
    void cut() {
        System.out.println("Pizza Cheese Cut ");
    }
}
