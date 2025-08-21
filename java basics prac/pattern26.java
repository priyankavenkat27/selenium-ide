public class pattern26{
    public static void main(String[] args) {
        int count = 1;  

        for (int row = 1; row <= 4; row++) {  
            for (int col = 1; col <= row; col++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println(); 
        }
    }
}


