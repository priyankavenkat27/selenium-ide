
public class writeclass {
    public void writeToFile(String filePath, String content) {
        try (java.io.FileWriter writer = new java.io.FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Data written successfully to: " + filePath);
        } catch (java.io.IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeclass wf = new writeclass();
        String filePath = "output.txt"; // You can give full path here
        String content = "This is written from the writefile class";
        wf.writeToFile(filePath, content);
    }
}
