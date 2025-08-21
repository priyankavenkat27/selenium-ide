import java.io.File;
import java.io.IOException;

public class tempfiles {
    public static void main(String[] args) {
        try {
            File tempFile = File.createTempFile("temp", ".txt");
            System.out.println("Temporary file created: " + tempFile.getAbsolutePath());

            // Optionally delete on exit
            tempFile.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
