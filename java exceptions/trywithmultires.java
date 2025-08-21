//PROGRAM FOR TRY WITH MULTIPLE RESOURCES

import java.io.*;
import java.util.zip.*;

public class trywithmultires {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("test.txt");
             GZIPOutputStream gzos = new GZIPOutputStream(new FileOutputStream("test.gz"))) {
            
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) > 0) {
                gzos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}