package _230101;

class Vehicle {
}

class Engine {
}

class Brake {
}

public class Car extends Vehicle {
    private Engine e;
    private Brake b;

    public Car() {
        this.e = new Engine();
        this.b = new Brake();
    }
}