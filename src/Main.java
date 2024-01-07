import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 1
        int b = sc.nextInt(); // 2

        int x = b / 100; // 100의 자리 수
        int y = (b - (x * 100)) / 10; // 10의 자리 수
        int z = b - ((x * 100) + (y * 10)); // 1의 자리 수

        System.out.println(a * z); // 3
        System.out.println(a * y); // 4
        System.out.println(a * x); // 5
        System.out.println(a * b); // 6
    }
}
