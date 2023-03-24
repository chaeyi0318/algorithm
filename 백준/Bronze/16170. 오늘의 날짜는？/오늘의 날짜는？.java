import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        System.out.println(time.getYear());
        System.out.println(time.getMonthValue());
        System.out.println(time.getDayOfMonth());
    }
}