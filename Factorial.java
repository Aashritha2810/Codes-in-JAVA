import java.util.Scanner;
public class Factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int x= sc.nextInt();
        int y= 1;
        int z= 1;
        while (y<=x){
        z= z * y;
        y++;
        }
        System.out.println(z);
    }
}
