import java.io.File;

public class comparefiles {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\priya\\Desktop\\file1.txt");
        File file2 = new File("C:\\Users\\priya\\Desktop\\file1.txt");

        if (file1.getAbsolutePath().equals(file2.getAbsolutePath())) {
            System.out.println("Both paths are the same.");
        } else {
            System.out.println("Paths are different.");
        }
    }
}
