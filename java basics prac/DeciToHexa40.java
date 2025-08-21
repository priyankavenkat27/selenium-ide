//Decimal to Hexadecimal

public class DeciToHexa {
    public static void main(String[] args) {
        int decimal = 10;
        String hex = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hex.toUpperCase());
    }
}