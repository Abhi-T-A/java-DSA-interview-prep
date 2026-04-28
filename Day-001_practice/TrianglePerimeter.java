import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        int side1 = sc.nextInt();

        System.out.print("Enter side 2: ");
        int side2 = sc.nextInt();

        System.out.print("Enter side 3: ");
        int side3 = sc.nextInt();

        int perimeter = side1 + side2 + side3;

        System.out.println("Perimeter = " + perimeter);

        sc.close();
    }
}
