package oop.abstraction;

public class PizzaCheese extends Pizza {
    public PizzaCheese(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.print("Pizza Cheese Prepare ");
    }

    @Override
    void sauce() {
        System.out.print("Pizza Cheese Sauce ");
    }

    @Override
    void bake() {
        System.out.print("Pizza Cheese Bake ");
    }

    @Override
    void cut() {
        System.out.print("Pizza Cheese Cut ");
    }
}
