public class catchbaseexcep {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) { // Catching the base Exception class
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }
    }
}