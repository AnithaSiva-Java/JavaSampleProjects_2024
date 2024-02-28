package dowhilelopp;

import java.util.Scanner;

public class SampleB {

	public static void main(String[] args) {
System.out.println("Start of Execution");
    int a=1;
    Scanner val=new Scanner(System.in);
    System.out.println("Enter the table value");
    int table=val.nextInt();
    do {
    	System.out.println(a+"x"+table+"="+a*table);
    	a=a+1;
    	    }
	while(a<=10);
    System.out.println("Ënd of Execution...!");
    }
		

}
