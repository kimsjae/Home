package _231225;

/**
 * 원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza 클래스를 작성해보자.<p><p>
 * 실행결과<p>
 * 피자의 종류 : Pepperoni, 피자의 크기 : 20
 */

class Circle {
    protected int radius;

    public Circle(int r) {
        radius = r;
    }
}

class Pizza {
    String name;
    int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

public class ch06Programming {
    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni", 20);
        System.out.println("피자의 종류 : " + obj.name + ", 피자의 크기 : " + obj.size);
    }
}
