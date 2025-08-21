import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the file path
        System.out.print("Enter the full path of the file to read: ");
        String filePath = scanner.nextLine();

        // Try-with-resources ensures the file is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nContents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file:");
            e.printStackTrace();
        }

        scanner.close();
    }
}
