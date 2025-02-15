interface Vehicle{
    void start();
}

class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("The car is starting...");
    }
}



public class AbstractionInterfaceMethod {
    public static void main(String[] args) {
        Car car= new Car();
        car.start();
    }
}
