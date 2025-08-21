public class throwsdemo {
    static void riskyMethod() throws ArithmeticException {
        System.out.println("Inside risky method");
        throw new ArithmeticException("Something went wrong");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
