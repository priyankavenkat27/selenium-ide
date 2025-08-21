//AREA OF RECTANGLE

import java.util.Scanner;

public class areaofrect32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("Area of rectangle = " + area);
    }
}

