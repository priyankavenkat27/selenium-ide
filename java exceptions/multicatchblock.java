public class multicatchblock {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 30 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getClass().getSimpleName());
        }
    }
}