import java.util.*;
	public class ReportCard{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your marks in Maths");
	int m= sc.nextInt();
	System.out.println("Enter your marks in Chemistry");
	int c= sc.nextInt();
	System.out.println("Enter your marks in Physics");
	int p= sc.nextInt();
	int total= m + c + p;
	int maxMarks= 300;
	float percentage= (float) total / maxMarks * 100.0f;
	System.out.println("Your Total Marks Are = " + total);
	System.out.println("Your percentage is: " + percentage);
		}
}
	