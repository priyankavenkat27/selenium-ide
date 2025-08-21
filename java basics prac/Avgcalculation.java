// To calculate the average of the numbers in an array
import java.util.Scanner;

public class Avgcalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by space: ");
        String[] input = scanner.nextLine().split(" ");
        
        double sum = 0;
        for (String num : input) {
            sum += Double.parseDouble(num);
        }
        
        double average = sum / input.length;
        System.out.println("Average: " + average);
        scanner.close();
    }
}