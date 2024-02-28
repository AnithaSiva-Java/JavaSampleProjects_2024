package forloop;

public class SampleG {

	public static void main(String[] args) {
//Do while Loop Fibonacci Series
			int a=0;
			int b=1;
			int c;
			
			int x=1;
			
			do
			{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			x=x+1;
			
			}while(x<=10);
			//System.out.println("The Factorial of x is" +output);
			
	}

}
