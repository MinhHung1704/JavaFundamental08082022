package oop.inheritance_polymorphism;

public class VietcomBank extends Bank {
    @Override
    public void calculateRate(int month) {
        if (month > 0 && month <= 6) {
            super.setRate(6f);
            System.out.print("Lãi suất là " + super.getRate());
        } else if (month >= 12) {
            super.setRate(7.5f);
            System.out.print("Lãi suất là " + super.getRate());
        } else {
            System.out.print("Không có lãi suất");
        }
    }
}
