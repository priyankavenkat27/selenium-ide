import java.util.Scanner;

public class oddoreven20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("it is a even number");
                }else{
                    System.out.println("it is a odd number");
                }
    }
}
