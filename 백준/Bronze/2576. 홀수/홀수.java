import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;

        int min = 100;

        for (int i = 0; i < 7; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) % 2 != 0) {
                result += arr.get(i);
                min = Math.min(min, arr.get(i));
            }
        }

        if(result == 0) {
            System.out.println(-1);

        } else {
            System.out.println(result);
            System.out.println(min);
        }
    }
}