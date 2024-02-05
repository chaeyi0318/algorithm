import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        if(a + b + c == 180){
            if(a == b && b == c)
                System.out.println("Equilateral");
            else if(a == b || b == c || c == a)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
        else
            System.out.println("Error");
    }
}