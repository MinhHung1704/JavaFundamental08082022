package oop.abstraction;

public class PizzaVegetable extends Pizza {
    public PizzaVegetable(String name) {
        super(name);
    }

    @Override
    void prepare() {
         System.out.println("Pizza Vegetable Prepare");
    }

    @Override
    void sauce() {
        System.out.println("Pizza Vegetable Sauce ");
    }

    @Override
    void bake() {
        System.out.println("Pizza Vegetable Bake ");
    }

    @Override
    void cut() {
        System.out.println("Pizza Vegetable Cut ");
    }
}
