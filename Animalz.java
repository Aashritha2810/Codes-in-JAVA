    class Animal{
        void makeSound(){
            System.out.println("Animals Make Sound");
        }
    }

    class Cat extends Animal{
        @Override
        void makeSound(){
            System.out.println("Meow Meow");
        }
    }
    public class Animalz {
    public static void main(String[] args) {
    Animal animals= new Animal();
    animals.makeSound();
    Cat cat= new Cat();
    cat.makeSound();

    }
}
