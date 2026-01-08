//Conditional Operators
class example4
{
	public static void main(String[] args)
	{
		boolean b = (5>2)?true:false;
		System.out.println(b);
		
		char ch = (true)?'T':'F';
		System.out.println(ch);
		
		String str = (true)?"Welcome":"No Entry";
		System.out.println(str);
	}
}