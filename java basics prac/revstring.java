//Program to find the reverse of a string
import java.util.Scanner;

public class revstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //gets the input from the user.
        System.out.print("Enter the array : ");
        String[] elements = sc.nextLine().split(" ");
        
        System.out.print("Original array: ");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        
        System.out.print("\nReversed array: ");
        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        
        sc.close();
    }
}