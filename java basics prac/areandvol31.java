//AREA AND VOLUME

import java.util.Scanner;
class Shape {
    double length, width, height;

    void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double area() {
        // Surface area of a cuboid = 2(lw + lh + wh)
        return length * width;}

    double volume() {
        // Volume of cuboid = l * w * h
        return length * width * height;
    }
}

public class areandvol31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Shape shape = new Shape();
        shape.setDimensions(l, w, h);

        System.out.println("Surface Area = " + shape.area());
        System.out.println("Volume = " + shape.volume());
        sc.close();
    }
}
