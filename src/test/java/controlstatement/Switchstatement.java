package controlstatement;

public class Switchstatement 
{

	public void switch1case() 
	{
		int numbe = 15 ;
		switch (numbe) 
		{
		case 68:
			System.out.println("number 12");
			break;
        case 13:
        	System.out.println("number 13");
			break;
        case 14:
        	System.out.println("number 14");
	        break;
	    case 15:
	    	System.out.println("number 15");
		    break;
		default:
			break;
		}	
	}
	
	public void switch1case2() 
	{
		
	// remove break keyword try to execute 
		// only one next case will execute not next to next case
		// 13 and 14 will execute not 15
		
		int numbe = 13 ;
		switch (numbe) 
		{
		case 68:
			System.out.println("number 12");
			break;
        case 13:
        	System.out.println("number 13");
			
        case 14:
        	System.out.println("number 14");
	        break;
	    case 15:
	    	System.out.println("number 15");
		    break;
		default:
			break;
		}	
	}
	public void switch1case3() 
	{
		//where we are printing month name for the given number  
		String monthname = "";
		int month = 5;
		switch (month) 
		{
		case 1:monthname="1---january---";
			
			break;
        case 2:monthname="2---february---";
			
			break;
        case 3:monthname="3---march---";
	
	        break;
        case 4:monthname="4---april---";
	
	        break;
        case 5:monthname="5---may---";
	
	        break;
        case 7:monthname="7---July---";
        	
	        break;
        case 6:monthname="6---june---";
        	
	        break;
		default:
		
			break;		
		}
		System.out.println(monthname);
	}
	public void switch1case4() 
	{
		int number=30;  
	    //switch expression with int value  
	    switch(number)
	    {  
	    //switch cases without break statements  
	    case 10: System.out.println("10");  
	    case 20: System.out.println("20");  
	    case 30: System.out.println("30");  
	    case 40: System.out.println("40"); 
	    default:System.out.println("Not in 10, 20 or 30");  
	    }
	}
	
	public void switch1case5() 
	{
		 //Declaring String variable  
	    String levelString = "Intermediate";  
	    int level=0;  
	    //Using String in Switch expression  
	    switch(levelString)
	    {    
	    //Using String Literal in Switch case  
	    case "Beginner": 
	    	level=1;  
	    break;    
	    case "Intermediate": 
	    	level=2;  
	    break;    
	    case "Expert": 
	    	level=3;  
	    break;    
	    default: 
	    	level=0;  
	    break;  
	    }    
	    System.out.println("Your Level is: "+level);  
	}
	
	public void name6() 
	{
		//Java Program to demonstrate the use of Java Nested Switch 
		//C - CSE, E - ECE, M - Mechanical  
        char branch = 'M';                 
        int collegeYear = 3;  
        switch( collegeYear )  
        {  
            case 1:  
                System.out.println("English, Maths, Science");  
                break;  
            case 2:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Operating System, Java, Data Structure");  
                        break;  
                    case 'E':  
                        System.out.println("Micro processors, Logic switching theory");  
                        break;  
                    case 'M':  
                        System.out.println("Drawing, Manufacturing Machines");  
                        break;  
                }  
                break;  
            case 3:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
        }
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Switchstatement switchstatement = new Switchstatement();
		switchstatement.switch1case4();
	}

}
