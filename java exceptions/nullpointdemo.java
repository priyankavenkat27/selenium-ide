public class nullpointdemo {
    public static void main(String[] args) {
        try {
            String str=null; 
            System.out.println(str.length()); //this throws nullpointerexception

        } catch (NullPointerException e) {
            System.out.println("caught the exception" +e.getMessage());
        }
    }
}
