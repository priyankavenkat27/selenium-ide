
    class A {
    public void show() {
        System.out.println("I'M THE PARENT CLASS");
    }
}

class B extends A {
    public void display() {
        System.out.print("I'M THE CHILD CLASS");
    }
}

public class inheritance28 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();      // From parent class
        obj.display();   // From child class
    }
}

    

