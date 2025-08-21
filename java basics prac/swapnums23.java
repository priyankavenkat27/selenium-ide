import java.util.Scanner;

public class swapnums23 {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the first number");
       int a=sc.nextInt();
       System.out.println("enter the second number");
       int b=sc.nextInt();
       int temp=a;
       a=b;
    b=temp;
       System.err.println("numbers after swapping"+" " +"a="+a+" "+"b="+b);
   } 
}
