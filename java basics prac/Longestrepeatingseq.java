// PROGRAM TO FIND THE LONGEST REPEATING SEQUENCE
import java.util.Scanner;

public class Longestrepeatingseq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int maxCount = 1, currentCount = 1;
        char maxChar = str.charAt(0);
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxChar = str.charAt(i);
                }
            } else {
                currentCount = 1;
            }
        }
        
        System.out.println("Longest repeating sequence: " + 
                          maxChar + " (" + maxCount + " times)");
        sc.close();
    }
}