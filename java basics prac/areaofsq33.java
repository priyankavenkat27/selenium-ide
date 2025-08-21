//AREA OF SQUARE

import java.util.Scanner;

public class areaofsq33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side length of square: ");
        double side = sc.nextDouble();

        double area = side * side;
        System.out.println("Area of square = " + area);
    }
}

