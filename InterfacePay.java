interface Payment{
    void pay();
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Its a plastic card");
    }
} 
class UPI implements Payment{
    @Override
    public void pay(){
        System.out.println("Its a networking in a phone");
    }
}
public class InterfacePay {
    public static void main(String[] args) {
      CreditCard cd= new CreditCard();
      cd.pay();
      UPI up= new UPI();
      up.pay();  
    }
}
