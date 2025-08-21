//ARMSTRONG NUMBER

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            int original = num, result = 0, temp = num;
            int digits = String.valueOf(num).length();

            while (temp != 0) {
                int digit = temp % 10;
                result += Math.pow(digit, digits);
                temp /= 10;
            }

            if (result == original) {
                System.out.println(original);
            }
        }
    }
}
