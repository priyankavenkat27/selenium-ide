public class methodoverloading29 {
   
     public void print(int i){
System.out.println("printing int: "+i);
     }   
     public void print(double d){
System.out.println("Printing double "+d);
     }
    public static void main(String[] args) {
        methodoverloading29 obj=new methodoverloading29();
        obj.print(30);
        obj.print(76.90);
        
    }
    }

