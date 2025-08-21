
import java.io.File;

public class renameFile {
    public static void main(String[] args) {
        File oldFile = new File("output.txt");
        File newFile = new File("newname.txt");

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename the file.");
        }
    }
}
