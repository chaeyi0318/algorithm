import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        String result = "";

        for (int i = 0; i < ch.length; i++) {
            if(ch[i] >= 'a' && ch[i] <= 'z') {
                result += String.valueOf(ch[i]).toUpperCase();
            } else {
                result += String.valueOf(ch[i]).toLowerCase();
            }
        }
        System.out.println(result);
    }
}