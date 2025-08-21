//2 level inheritance

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}


class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class twolevelinheri {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // inherited from Animal
        p.bark();  // inherited from Dog
        p.weep();  // own method
    }
}

