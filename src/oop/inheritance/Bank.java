package oop.inheritance;

public class Bank {
    private float rate;

    public void caculateRate(int month){
        if (month > 0 && month <= 6) {
            rate = 5.5f;
            System.out.print("Lãi suất là " + rate);
        } else if (month >= 12){
            rate = 7.0f;
            System.out.print("Lãi suất là " + rate);
        } else {
            System.out.print("Không có lãi suất");
        }
    }

    public float getRate(int i) {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
