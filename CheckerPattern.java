import java.util.Scanner;
public class CheckerPattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an Integer");
        int number= sc.nextInt();
        System.out.println("Enter a symbol");
        String symbol= sc.next();
        for(int row= 1; row <= number; row++){
            for(int col= 1; col <= number; col++){
                if(row%2 == 0){
                    System.out.print(symbol+ " ");
                } else{
                    System.out.print(" " +symbol);
                }
            }
            System.out.println();
        }
    }
}
