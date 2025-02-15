abstract class Animal3{
    abstract void makeSound();

    void sleep(){
        System.out.println("Sleeping...");
    }

}

class Dog extends Animal3{
    @Override
    void makeSound(){
        System.out.println("Bark Bark");
    }
}



public class AbstractionAbstractKeyword {
    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.makeSound();
        dog.sleep();
    }
}
