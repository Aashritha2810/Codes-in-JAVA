import java.util.*;
public class Remainder{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Number");
	int n= sc.nextInt();
	int r= n%2;
	if(r==0){
	System.out.println("Your Number is Even");
	}else{
	System.out.println("Your Number is Odd");
	}
	}
}
