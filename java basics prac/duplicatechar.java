// find the duplicates in  a string 
import java.util.Scanner;
public class duplicatechar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        
        System.out.println("Duplicate characters:");
        for (int i = 0; i < chars.length; i++) {
            boolean isDuplicate = false;
            
            // Check if this character was already counted
            for (int j = 0; j < i; j++) {
                if (chars[i] == chars[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // If not counted before, check for duplicates
            if (!isDuplicate) {
                int count = 1;
                for (int k = i + 1; k < chars.length; k++) {
                    if (chars[i] == chars[k]) {
                        count++;
                    }
                }
                
                if (count > 1) {
                    System.out.println(chars[i] + " - " + count + " times");
                }
            }
        }
    }
}