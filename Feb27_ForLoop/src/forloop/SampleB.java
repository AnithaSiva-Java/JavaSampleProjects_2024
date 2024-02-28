package forloop;

import java.util.Scanner;


public class SampleB {

	public static void main(String[] args) {
		
		Scanner abc= new Scanner(System.in);
		
		System.out.println("Enter which Table");
		
		int table=abc.nextInt();
		
		for(int a=1;a<=100;a=a+1)
		{
			System.out.println(a +"x" +table +"=" +a*table);
			
		}
		abc.close();

	}

}
