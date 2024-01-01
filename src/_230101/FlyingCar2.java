package _230101;

interface Flyable2 {
    void fly();
}

class Car2 {
    int speed;

    void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class FlyingCar2 extends Car2 implements Flyable {
    public void fly() {
        System.out.println("I'm flying!");
    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(300);
        obj.fly();
    }
}
