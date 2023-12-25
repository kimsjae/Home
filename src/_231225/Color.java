package _231225;

class Rectangle {
    int width, height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class ColorRectangle extends Animal {
    int width, height;
    String color;

    public ColorRectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
}

public class Color {
    public static void main(String[] args) {
        ColorRectangle obj = new ColorRectangle(100, 100, "blue");
        System.out.println("가로 : " + obj.width);
        System.out.println("세로 : " + obj.height);
        System.out.println("색상 : " + obj.color);
    }
}
