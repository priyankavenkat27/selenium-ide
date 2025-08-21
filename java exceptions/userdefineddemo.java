// Define the custom exception
class InvalidAgeException extends Exception {
    // Constructor
    public InvalidAgeException(String message) {
        super(message);  // Pass message to the base Exception class
    }
}

// Main class to use the custom exception
public class userdefineddemo {

    // Method that checks age
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access denied - Age must be at least 18.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); // Will throw our custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}
