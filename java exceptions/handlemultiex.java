public class handlemultiex {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50 / 0; // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught");
        } catch (Exception e) {
            System.out.println("Generic Exception caught");
        }
    }
}