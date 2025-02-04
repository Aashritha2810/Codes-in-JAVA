import java.util.Scanner;
public class Fibonacci28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int first = 1, second = 2;
        System.out.println("First" + n + "Fibonacci numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second; 
            first = second; 
            second = next; 
        }
    }
}
