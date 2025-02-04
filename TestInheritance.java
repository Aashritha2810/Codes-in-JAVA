class Animals {
    void eat(){
        System.out.println("This animal eats food");
    }
}
class Mammal extends Animals{
    void walk(){
        System.out.println("This Mammel walks.");
    }
}
class Cat extends Mammal{
    void meow(){
        System.out.println("This cat meows.");
    }
}
public class TestInheritance{
    public static void main(String args[]){
        Cat cat= new Cat();
        cat.eat();
        cat.walk();
        cat.meow();
    }
}
