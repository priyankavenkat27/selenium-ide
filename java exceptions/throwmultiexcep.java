public class throwmultiexcep {
    static void checkValues(int age, String name) throws ArithmeticException, NullPointerException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }
    }

    public static void main(String[] args) {
        try {
            checkValues(15, null);
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}