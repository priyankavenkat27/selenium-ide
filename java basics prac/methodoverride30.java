class Parent {
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class Child extends Parent {
    // Overriding the show() method of Parent class
    @Override
    void show() {
        System.out.println("This is the child class method.");
    }
}

public class methodoverride30 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();  // Calls Parent's show()

        Child c = new Child();
        c.show();  // Calls Child's overridden show()

        Parent pc = new Child();
        pc.show(); // Calls Child's show() due to runtime polymorphism
    }
}


