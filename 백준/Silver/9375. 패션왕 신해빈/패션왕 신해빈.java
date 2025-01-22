import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            HashMap<String, Integer> clothingMap = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                String clothingType = input[1];

                clothingMap.put(clothingType, clothingMap.getOrDefault(clothingType, 0) + 1);
            }

            int result = 1;

            for (int count : clothingMap.values()) {
                result *= (count + 1);
            }

            bw.write((result - 1) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
