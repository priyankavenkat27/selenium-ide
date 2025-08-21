//Occurence of a char in a string
import java.util.Scanner;
public class occurenceOfChar {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        
        char target = 'l';
        int count = 0;
        
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        
        System.out.println("'" + target + "' appears " + count + " times");
    }
}