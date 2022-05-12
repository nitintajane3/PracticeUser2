package constrcutorPracticepkg;

import org.testng.annotations.Test;

public class TestngTestProgram
{
	int abc;
	String teString;
	
	//In TestNG we can call constructor without creating object
	
	public TestngTestProgram() 
	{
		System.out.println("construcotr TestngTestProgram");
	}

	@Test
	public void test1()
	{	
		TestngTestProgram testngTestProgram = new TestngTestProgram();
		System.out.println(testngTestProgram.abc);
		System.out.println(testngTestProgram.teString);
	}

}
