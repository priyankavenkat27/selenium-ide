import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class filecreation {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        // Ask user for file path and name
        System.out.print("Enter the full path and file name (e.g., C:\\Users\\YourName\\Documents\\myfile.txt): ");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            System.out.println("File location: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        sc.close();
    }
}

