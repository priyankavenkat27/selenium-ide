//Binary to octal

public class BinarytoOctal {
    public static void main(String[] args) {
        String binary = "1010";
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
    }
}