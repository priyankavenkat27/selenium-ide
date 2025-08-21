//removal of white spaces
import java.util.Scanner;

public class removalwhitespaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String result = str.replaceAll("\\s", "");
        System.out.println("String after removing spaces: " + result);
        scanner.close();
    }
}