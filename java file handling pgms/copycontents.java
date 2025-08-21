import java.io.*;

public class copycontents {
    public static void main(String[] args) {
        File source = new File("hello.txt");
        File destination = new File("destination.txt");

        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)
        ) {
            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
