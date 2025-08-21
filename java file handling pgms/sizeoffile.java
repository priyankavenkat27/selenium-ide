import java.io.File;

public class sizeoffile {
    public static void main(String[] args) {
        File file = new File("hello.txt");

        if (file.exists()) {
            long bytes = file.length();
            double kb = bytes / 1024.0;
            double mb = kb / 1024.0;

            System.out.println("Size in Bytes: " + bytes);
            System.out.printf("Size in KB: %.2f\n", kb);
            System.out.printf("Size in MB: %.2f\n", mb);
        } else {
            System.out.println("File not found.");
        }
    }
}
