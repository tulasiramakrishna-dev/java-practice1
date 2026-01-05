//Q) Sunita wakes up at 6:30 AM and reaches school at 7:15 AM.
//Write a Java program to calculate total travel time in minutes.
class example9
{
	public static void main(String[] args)
	{
		int startinghour=6;
		int startingminute=30;
		int endinghour=7;
		int endingminute=15;
		int totalstarttime=(startinghour*60)+startingminute;
		int totalendtime=(endinghour*60)+endingminute;
		int totaltime=(totalendtime-totalstarttime);
		System.out.println("total time in minutes ="+totaltime);
		
	}	
}

