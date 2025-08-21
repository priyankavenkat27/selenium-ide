//PROGRAM USING TRY , CATCH AND FINALLY KEYWORDS

public class trycatchfinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executes regardless of exception");
        }
    }
}
