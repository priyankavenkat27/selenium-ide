public class arraystore {
    public static void main(String[] args) {
        try {
            Object[] objArray = new String[5];
            objArray[0] = 10; // This will cause ArrayStoreException
        } catch (ArrayStoreException e) {
            System.out.println("Caught ArrayStoreException: " + e.getMessage());
        }
    }
}