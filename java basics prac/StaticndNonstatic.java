//PROGRAM ON STATIC AND NON STATIC KEYWORDS
public class StaticndNonstatic {
    // Static variable
    static int staticCount = 0;
    
    // Non-static variable
    int nonStaticCount = 0;
    
    // Static method
    static void incrementStatic() {
        staticCount++;
        System.out.println("Static count: " + staticCount);
    }
    
    // Non-static method
    void incrementNonStatic() {
        nonStaticCount++;
        System.out.println("Non-static count: " + nonStaticCount);
    }
    
    public static void main(String[] args) {
        // Calling static method
        StaticndNonstatic.incrementStatic();
        StaticndNonstatic.incrementStatic();
        
        // Creating objects to call non-static method
        StaticndNonstatic obj1 = new StaticndNonstatic();
        StaticndNonstatic obj2 = new StaticndNonstatic();
        obj1.incrementNonStatic();
        obj2.incrementNonStatic();
       
    }
}