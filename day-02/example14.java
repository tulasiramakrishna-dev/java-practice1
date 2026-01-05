//Q) Write a java program to accept one salary and find out 10% of TDS ?
import java.util.Scanner;
class example14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the salary:");
		int sal = sc.nextInt();
		double tds = (double)sal*10/100;
		System.out.println("the 10% of tds is ="+tds);

	}	
}

