import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name = br.readLine();

        System.out.println(":fan::fan::fan:\n" +
                            ":fan::" + name + "::fan:\n" +
                            ":fan::fan::fan:");

    }
}