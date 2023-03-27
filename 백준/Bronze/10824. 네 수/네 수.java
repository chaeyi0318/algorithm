import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] number = br.readLine().split(" ");

        Long num1 = Long.parseLong(number[0] + number[1]);
        Long num2 = Long.parseLong(number[2] + number[3]);

        System.out.println(num1 + num2);
    }
}