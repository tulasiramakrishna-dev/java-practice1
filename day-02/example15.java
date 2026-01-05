//Q) Write a java program to find out CGPA to percentage ?
import java.util.Scanner;
class example15
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the CGPA:");
		double cgpa = sc.nextDouble();
		double percentage = cgpa * 9.5d;
		System.out.println("the percentage  is ="+percentage);

	}	
}

