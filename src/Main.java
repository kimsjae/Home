import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            String[] num = s.split(" ");
            long sum = 0;
            for (int i = 0; i < num.length; i++) {
                if (isNumeric(num[i])) { // 입력값이 숫자인지 확인
                    long a = Long.parseLong(num[i]);
                    sum = sum + a;
                } else {
                    System.out.println("숫자 형식이 아닌 입력이 감지되었습니다: " + num[i]);
                }
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(sum + "\n");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 입력값이 숫자로만 이루어져 있는지 확인하는 메서드
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}
