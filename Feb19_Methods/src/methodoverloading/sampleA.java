package methodoverloading;

public class sampleA {

	public static void main(String[] args) 
	{
		add2values(5,10);
		add2values(1.0,2.0);
	}
	
		public static void add2values(int a, int b)
		{
			System.out.println((a+b));
		}

public static void add2values(double a, double b)
{
	System.out.println(a+b);
}



}
