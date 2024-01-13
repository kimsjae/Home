import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int score = Integer.parseInt(br.readLine());

            if (score < 0) {
                bw.write("점수는 0보다 크거나 같고, 100보다 작거나 같은 정수입니다.");
                bw.flush();
            }
            if (score > 100) {
                bw.write("점수는 0보다 크거나 같고, 100보다 작거나 같은 정수입니다.");
                bw.flush();
            }

            if (score <= 100 && score >= 90) {
                bw.write("A\n");
            } else if (score < 90 && score >= 80) {
                bw.write("B\n");
            } else if (score < 80 && score >= 70) {
                bw.write("C\n");
            } else if (score < 70 && score >= 60) {
                bw.write("D\n");
            } else {
                bw.write("F\n");
            }
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
