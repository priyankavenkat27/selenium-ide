public class trycatch {
   public static void main(String args[]){
    try {
        int a=10/0;
        System.out.println("result="+ a);
    }
     catch (ArithmeticException e) {
        System.out.println("Division by zero not possible");
    }
    System.out.println("The program continues execution");
   } }

