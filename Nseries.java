import java.util.Scanner;
public class Nseries {
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter any integer");
       int x= sc.nextInt();
       int y= 0;
       int z= 0;
       while (y<=x){ 
        z= z + y;
        y++;
         }
         System.out.println(z);
    }
}
