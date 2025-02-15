interface Shape{
    void area();
}
class Circle implements Shape{
    @Override
    public void area(){
        System.out.println("The area of a circle is r square");
    }
}
class Rectangle implements Shape{
    @Override
    public void area(){
        System.out.println("The area is the length into breadth");
    }
}
public class InterfaceArea {
    public static void main(String[] args) {
        Circle circle= new Circle();
        circle.area();
        Rectangle rectangle= new Rectangle();
        rectangle.area();
    }
}
