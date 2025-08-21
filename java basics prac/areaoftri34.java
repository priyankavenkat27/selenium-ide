//AREA OF TRIANGLE

import java.util.Scanner;

public class areaoftri34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of triangle = " + area);
    }
}
