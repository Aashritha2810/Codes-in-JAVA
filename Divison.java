import java.util.Scanner;
public class Divison{
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numerator");
	float a= sc.nextFloat();
    System.out.println("Enter the Denominator");
	float b=sc.nextFloat();
	float c= 0;
	c= a / b;
	System.out.println(c);
	}
}