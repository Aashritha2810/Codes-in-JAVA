import java.util.*;
public class LeapYear
{
	public static void main(String rags[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Year");
	int y= sc.nextInt();
	if ((y%4==0) & ((y%100!=0)|(y%400==0)))
        	{
	System.out.println("This is a Leap Year");
		}
	else	
		{
	System.out.println("This is a Non Leap Year");
		}
	}
}