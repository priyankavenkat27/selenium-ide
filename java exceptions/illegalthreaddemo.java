public class illegalthreaddemo {
     public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Thread running"));
        thread.start();
        
        try {
            thread.start(); // This will cause IllegalThreadStateException
        } catch (IllegalThreadStateException e) {
            System.out.println("Caught IllegalThreadStateException: " + e.getMessage());
        }
    }
}
