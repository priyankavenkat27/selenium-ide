 //logical operators
 
 public class logicalopt {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(a > 0 && b > 0);  // true
        System.out.println(a > 0 || b < 0);  // true
        System.out.println(!(a > b));        // true
    }
}

