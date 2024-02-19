package methodoverloading;

public class SampleB {
	public static void main(String[] args) 
	{
		main();
		main(true);
	}
	
		public static void main()
		{
			System.out.println("Calling Main Method");
		}
		public static void main(boolean a)
		{
			System.out.println(a);
		}


}
