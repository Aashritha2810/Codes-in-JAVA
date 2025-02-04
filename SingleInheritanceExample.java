class Parent {
    void parent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void child() {
        System.out.println("This is the child class.");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parent();  // Inherited method
        obj.child();     // Child class method
    }
}
