public class catchbaseandchild {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) { // Child exception
            System.out.println("Caught ArithmeticException");
        } catch (Exception e) { // Base exception
            System.out.println("Caught generic Exception");
        }
    }
}