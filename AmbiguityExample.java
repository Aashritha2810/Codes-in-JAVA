interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Resolved ambiguity in multiple inheritance.");
    }
}

public class AmbiguityExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
