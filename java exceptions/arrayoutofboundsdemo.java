public class arrayoutofboundsdemo {
    public static void main(String[] args) {
        try{
        int[] arr= new int[5];
        arr [6]= 9; //causes the arrayoutofboundsexception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("caught the exception"+e.getMessage());
        }
    }
}
