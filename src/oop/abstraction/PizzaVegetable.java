package oop.abstraction;

public class PizzaVegetable extends Pizza {
    public PizzaVegetable(String name) {
        super(name);
    }

    @Override
    void prepare() {
         System.out.print("Pizza Vegetable Prepare");
    }

    @Override
    void sauce() {
        System.out.print("Pizza Vegetable Sauce ");
    }

    @Override
    void bake() {
        System.out.print("Pizza Vegetable Bake ");
    }

    @Override
    void cut() {
        System.out.print("Pizza Vegetable Cut ");
    }
}
