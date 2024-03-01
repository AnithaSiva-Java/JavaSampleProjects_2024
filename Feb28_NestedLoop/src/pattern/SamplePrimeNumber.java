package pattern;

import java.util.Scanner;

public class SamplePrimeNumber {

	public static void main(String[] args) {
		
		try (Scanner num = new Scanner(System.in)) {
			int x=num.nextInt();
			
			System.out.println("Enter the number:");
			
			int pm=x;
			
			System.out.println(pm);
			
				
			if(x/x==1 || x/1==x) 
			{
				System.out.println(x +"  is a Prime Number");
			}
			else
			{
				System.out.println(x +"  is a not a Prime Number");
			}
		}
		}
		}




