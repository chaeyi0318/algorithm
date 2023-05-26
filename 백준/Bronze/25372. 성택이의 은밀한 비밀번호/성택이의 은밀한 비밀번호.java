import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String pw = br.readLine();

            if (pw.length() > 9 || pw.length() < 6) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}