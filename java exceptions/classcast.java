public class classcast {
    public static void main(String[] args) {
        try {
            // Create a parent class reference pointing to a child class object
            Object obj = "Hello World";  // String is-a Object
            
            // This cast will fail at runtime because a String is not an Integer
            Integer number = (Integer) obj;  // This will throw ClassCastException
            
            System.out.println("This won't be printed: " + number);
            
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
            System.out.println("Cannot cast String to Integer");
        }
    }
}