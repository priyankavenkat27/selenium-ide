//constructor eg

class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructorr36 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        s1.display();

        Student s2 = new Student("Bob", 22);
        s2.display();
    }
}

