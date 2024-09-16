import java.util.*;
public class Celsius{
	public static void main(String rags[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Temp in celsius");
	float c= sc.nextInt();
	float f= c * 9/5 + 32;
	System.out.println("The temp in farenheit is=" +f);
	}
}
