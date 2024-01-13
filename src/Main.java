import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int year = Integer.parseInt(br.readLine());
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
