import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= sc.nextInt();
        int originalNumber= number;
        int result = 0;
        int numberOfDigits= (int) Math.log10(number) + 1;
        while (number > 0){
            int digit= number % 10;
            result += Math.pow(digit, numberOfDigits);
            number /= 10;
        }
        if (result == originalNumber){
            System.out.println(originalNumber +  " is an Armstrong number");
        } else{
            System.out.println(originalNumber +  " is not an Armstrong number");
        }
    }
}
