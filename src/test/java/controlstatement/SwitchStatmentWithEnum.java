package controlstatement;

public class SwitchStatmentWithEnum 
{
	public enum vowel{a,b,c,d,e,f}
	
	// example with all enum value
	public void TestEnumSwitch() 
	{
		
		vowel[] eachChar = vowel.values();
		for (vowel getChar : eachChar) 
		{
			switch (getChar) 
			{
			case a:
				System.out.println("a");
				break;
            case b:
            	System.out.println("b");
				break;
            case c:
            	System.out.println("c");
				break;
            case d:
            	System.out.println("d");
				break;
            case e:
            	System.out.println("e");
				break;
            case f:
            	System.out.println("f");
				break;
			default:
				System.out.println("default");
				break;
			}
		}
		
	}
	
	public void TestOneEnumFromList() 
	{
		// getting only one value from enum list and run only this value
		vowel getOneValue = vowel.c;
		
		switch (getOneValue) 
		{
		case a:
			System.out.println("a");
			break;
        case b:
        	System.out.println("b");
			break;
        case c:
        	System.out.println("c");
			break;
        case d:
        	System.out.println("d");
			break;
        case e:
        	System.out.println("e");
			break;
        case f:
        	System.out.println("f");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		SwitchStatmentWithEnum statmentWithEnum = new SwitchStatmentWithEnum();
		statmentWithEnum.TestOneEnumFromList(); 
	}

}
