public class arithmeticexcep {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;
            
            // This will throw ArithmeticException (division by zero)
            int result = numerator / denominator;
            
            System.out.println("Result: " + result); // This line won't execute
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
            System.out.println("Exception details: " + e.getMessage());
        }
        
        System.out.println("Program continues after exception handling.");
    }
}