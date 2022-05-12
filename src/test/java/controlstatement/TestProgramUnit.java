package controlstatement;

import java.util.Scanner;

public class TestProgramUnit 
{
	public void name() 
	{
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		System.out.print("Enter third number- ");  
		int c= sc.nextInt();  
		
		
		if ((c-a)>=b)
            {		   
		      System.out.println(c-(c%a)+b);
		  }
		else { 
		    
		    		System.out.println("-1");
		    		}
	}

	public static void main(String[] args) 
	{
		TestProgramUnit testProgramUnit = new TestProgramUnit();
		testProgramUnit.name();
	}
}
