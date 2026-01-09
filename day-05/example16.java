// Write a java program to find out the cost based on user inputs.
//A program must prompt users to enter total weight of items (in kilograms) and shipping destination (domestic or international).
//For domestic orders, a program must charge Rs.500 upto 5kg and Rs.100 per additional kg.
//For international orders a program must charge  Rs.1000 upto 5kg and Rs.200 per additional kg, 
//and Rs.500 surcharge if weight exceeded to 10 kg.Find out calculated shipping cost.
import java.util.Scanner;
class example16
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total weight of item:");
		int weight = sc.nextInt();
		System.out.println("Enter the Shipping Destination");
		String destination = sc.next().toLowerCase();
		int cost = 0;
		
		if(destination.equals("domestic"))
		{
			if (weight<=5)
			{
				cost=500;
			}
			else
			{
				cost = 500 + (weight-5)*100;
			}
		}
		if(destination.equals("international"))
		{
			if(weight<=5)
			{
				cost=1000;
			}
			else if(weight>5 && weight<=10)
			{
				cost = 1000 + (weight-5)*200;
			}
			else
			{
				cost = 1000 + (weight-5)*200 + 500;
			}
		}
		System.out.println("total shipping cost is "+cost);
	}
}