import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int num= sc.nextInt();
        sc.close();
        while(num!=0){
            int d= num % 10;
            System.out.print(" " + d);
            num/=10;
        }

    }
}
