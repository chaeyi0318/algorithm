import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine().toLowerCase();

            if (str.equals("#")) {
                break;
            }
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ch == 'a'|| ch == 'o' || ch == 'e' || ch == 'u' || ch == 'i') {
                    count++;
                } else {
                    continue;
                }
            }
            System.out.println(count);
        }
    }
}