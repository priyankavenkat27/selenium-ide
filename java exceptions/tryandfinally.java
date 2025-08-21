public class tryandfinally {
    public static void main(String args[]){
        try{
            int a=10/0;
            System.out.println("ERROR");
        }finally {
            System.out.println("Finally block always executes");
        }
    }
}
