interface A{void a();}
interface B{void b();}
class C implements A,B{
    @Override
  public void a(){
        System.out.println("Yippy");
    }
    @Override
  public void b(){
        System.out.println("Kayak");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        C c= new C();
        c.a();
        c.b();
    }
}
