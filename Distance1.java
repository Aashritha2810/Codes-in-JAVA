import java.util.*;
public class Distance1{
	public static void main(String rags[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Speed in Kms");
	int s= sc.nextInt();
	System.out.println("Enter Time in Hrs");
	int t= sc.nextInt();
	int d=0;
	System.out.println("Speed =" +s);
	System.out.println("Time =" +t);
//now finding out the distance
	d=s * t;
	System.out.println("The distance travelled  = " +d);
	}
}