//perimeter of rectangle

import java.util.Scanner;


public class perimeterofrec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length:");
        double a=sc.nextDouble();
        System.out.println("enter the width:");
        double b=sc.nextDouble();
        double peri=2*(a+b);
        System.out.println("The perimeter of the rectangle is =" + peri);
    }
}
