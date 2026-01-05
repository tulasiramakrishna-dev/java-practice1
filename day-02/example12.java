//Write a java program to convert time in seconds?
import java.util.Scanner;
class example12
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
	    System.out.println("Enter hours:");
		int h = sc.nextInt();
		System.out.println("Enter minutes:");
		int m= sc.nextInt();
		System.out.println("Enter seconds:");
		int s =sc.nextInt();
		//logic
		int totalseconds = (h*3600)+(m*60)+(s);
		System.out.println("the total time in seconds ="+totalseconds);
	}	
}

