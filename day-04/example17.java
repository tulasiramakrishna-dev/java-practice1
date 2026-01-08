//pre incriment/Decriment
class example17
{
	public static void main(String[] args)
	{
		int i =10;
		++i;
		System.out.println(i);//11
		
		int a=9;
		int b=++a + ++a + ++a;
		System.out.println(a+" "+b);//12 33
		
		int r=16;
		--r;
		System.out.println(r);//15
		
		int h= 14;
		int k= --h + --h + --h;
		System.out.println(h+" "+k);//11 36
		
		int m = 67;
		int n= ++m + --m + ++m + ++m;//69 272
		System.out.println(m+" "+n);
	
	}
} 