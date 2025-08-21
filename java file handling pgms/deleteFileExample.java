import java.io.File;
import java.util.Scanner;

public class deleteFileExample{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the file path to delete
        System.out.print("Enter the full path of the file to delete: ");
        String filePath = scanner.nextLine().trim().replaceAll("^\"|\"$", "");

        // Create File object
        File file = new File(filePath);

        // Try to delete the file
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file. It might be in use or locked.");
            }
        } else {
            System.out.println("File does not exist at: " + file.getAbsolutePath());
        }

        scanner.close();
    }
}
