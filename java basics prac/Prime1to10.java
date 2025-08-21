//prime nums from 1 to 10

public class Prime1to10 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10 are:");

        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}








