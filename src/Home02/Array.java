package Home02;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성하시오.
        // 신발 사이즈는 250부터 295까지 5단위로 증가

//        int[] size = new int[10];
//
//
//        for (int i = 0; i < size.length; i++) {
//            size[0] = 250;
//            System.out.println("사이즈 " + size[i] + " (재고 있음)");
//            size[i + 1] = size[i] + 5;
//        }


        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("grape");
        list.add("철수");
        list.add("영희");
        list.remove(0);

        for (String lists : list) {
            System.out.println(lists + " ");
        }

    }
}
