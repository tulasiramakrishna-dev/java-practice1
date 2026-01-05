//Write a java program to seconds in time?
class example13
{
	public static void main(String[] args)
	{
		int ts = 37823;
		int h = (ts/3600);
		int m =(ts%3600)/60;
		int s =(ts%60);
		System.out.println("time is "+h+":"+m+":"+s);

	}	
}

