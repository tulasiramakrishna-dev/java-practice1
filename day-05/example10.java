//wrte a java program to find the given year is leap year or not.
import java.util.Scanner;
class example10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println("It is a leap year");
		else
			System.out.println("It is a non leap year");
		
	}
}