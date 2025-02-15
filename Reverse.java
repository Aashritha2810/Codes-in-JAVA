import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any integer to be reversed");
        int num= sc.nextInt(); 
        sc.close();
        int reversed= 0;
        System.out.println("The given number is: " + num);
        while(num!=0){
            int digit= num % 10;
            reversed= reversed * 10 + digit;
            num/= 10;
        }
        System.out.println("The reversed number is: " + reversed);
    }
}
