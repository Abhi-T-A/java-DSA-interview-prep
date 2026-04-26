
import java.util.Scanner;

public class add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int a = sc.nextInt();
        System.out.println("Enter your second number:");
        int b = sc.nextInt();
        System.out.println("Enter your third number:");
        int c = sc.nextInt();
        int result = a + b + c;
        System.out.println("\n"+result);
    }
}
