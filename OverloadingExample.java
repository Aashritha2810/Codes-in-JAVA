class MathOperations{
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

}
public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations mo= new MathOperations();
        System.out.println(mo.add(5, 15));
        System.out.println(mo.add(5, 15, 10));
    }
}
