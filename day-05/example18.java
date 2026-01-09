// Student scholarship criteria 
// Marks condition-Marks = 85 
//Income condition -Family income = ?2,50,000
//Category condition-SC / ST ? Relaxed marks (= 75) & OBC ? Normal marks (= 85) & General ? Strict marks (= 90)
//Scholarship is granted only if BOTH income and marks conditions are satisfied for the category.
//Add:Different income limits per category
//Example:SC/ST ? 300000 ,OBC ? 250000 ,General ? 200000
import java.util.Scanner;
class example18
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks:");
		int marks = sc.nextInt();
		System.out.println("Enter the Family Income:");
		int income = sc.nextInt();
		System.out.println("Enter the category:");
		String category = sc.next().toUpperCase();
		
		if(income>300000)
		{
			System.out.println("The student is not eligible for scholarship");
		}
		else if(category.equals("SC") || category.equals("ST"))
		{
			if(marks>=75 && income<=300000)
				System.out.println("The student is eligible for scholarship");
			else
				System.out.println("The student is not eligible for scholarship");
		}
		else if(category.equals("OBC"))
		{
			if(marks>=85 && income<=250000)
				System.out.println("The student is eligible for scholarship");
			
			else
				System.out.println("The student is not eligible for scholarship");
		}
		else if(category.equals("GENERAL"))
		{
			if(marks>=90 && income<=200000)
				System.out.println("The student is eligible for scholarship");
			
			else
				System.out.println("The student is not eligible for scholarship");
		}
		else
			System.out.println("Invalid data");
				
		
		
	}
}