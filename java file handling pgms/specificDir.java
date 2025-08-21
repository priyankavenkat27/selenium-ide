import java.io.File;
import java.io.IOException;

public class specificDir {
    public static void main(String[] args) {
        String dirPath = "C:\\Users\\priya\\Documents\\myfolder";
        String fileName = "newfile.txt";

        File dir = new File(dirPath);
        if (!dir.exists()) {
            dir.mkdirs(); // Create directories if they don't exist
        }

        File file = new File(dir, fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created at: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
