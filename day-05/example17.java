// Switch case Statements
import java.util.Scanner;
class example17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option");
		int option = sc.nextInt();
		
		switch(option)
		{
			case 100: System.out.println("It is police number");
			break;
		
			case 108: System.out.println("It is emergency number");
			break;
			
			case 103: System.out.println("It is enquiry number");
			break;
			
			case 107: System.out.println("It is RTI number");
			break;
			
			default:System.out.println("It is invalid number"); 
		}
		
	}
}