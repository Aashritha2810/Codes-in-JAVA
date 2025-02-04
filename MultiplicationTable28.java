import java.util.Scanner;
public class MultiplicationTable28 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size: ");
        int number= sc.nextInt();

        System.out.printf("  * |");
        for (int row = 1; row<=number; row++) {
            System.err.printf("%4d",  row);
        }
        System.out.println("");
        for (int row = 0; row <= number; row++) {
            System.out.print("----");
        }
        System.out.print("--");
        System.out.println("");

        for (int row = 1; row <= number; row++) {
            System.out.printf("%4d |", row);
            for (int col = 1; col <= number; col++) {
                System.out.printf("%4d", col*row);
            }
            System.out.println("");
        }
    }
}
