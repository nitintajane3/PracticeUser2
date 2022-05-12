package constrcutorPracticepkg;

public class ConstrcutorExamples 
{

	int value;
	String teString;
	
	
	public ConstrcutorExamples() 
	{
		System.out.println("ConstrcutorExamples");
	}
	
	public ConstrcutorExamples(String test,int age) 
	{
		teString=test;
		value=age;
		this.teString=test;
		this.value=age;
		System.out.println( teString +  " with parameterise ConstrcutorExamples " + value);
	}
	
	public void name() 
	{
		teString="nitintajane";
		value=45;
		
		System.out.println("data from method " + teString + " " +  value);
	}
	public static void main(String[] args) 
	{
		// here we are passing value to constructor and that value passing to the
		// instance variable. and then when you call to the local variable then
		// it will print below value not the default value.
		ConstrcutorExamples constrcutorExamples = new ConstrcutorExamples("nitin",12);
		constrcutorExamples.name();
		

	}

}
