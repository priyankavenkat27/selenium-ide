public class instance04 {
    
    // Instance variable declaration
    private int instanceVar = 10;
    
    public void printValue() {
        System.out.println("Instance variable value: " + instanceVar);
    }
    
    public static void main(String[] args) {
        instance04 obj = new instance04();
        obj.printValue();
    }
}

