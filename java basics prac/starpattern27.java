public class starpattern27 {
    
    public static void main(String[] args) {
        int rows = 4;  // number of rows

        for (int i = 1; i <= rows; i++) {  // outer loop for rows
            for (int j = 1; j <= i; j++) { // inner loop for stars in each row
                System.out.print("* ");
            }
            System.out.println();  // new line after each row
        }
    }
}

