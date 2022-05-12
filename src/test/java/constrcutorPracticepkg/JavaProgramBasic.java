package constrcutorPracticepkg;

public class JavaProgramBasic 
{
// default constructor example and there default value	
	
	int a;
	String test;
	
	public JavaProgramBasic() 
	{
		System.out.println("JavaProgramBasic");
	}
	
	public static void main(String[] args) 
	{
		
		/*JavaProgramBasic javaProgramBasic = new JavaProgramBasic();
		System.out.println(javaProgramBasic.a);
		System.out.println(javaProgramBasic.test);*/
		
		TypeCastingExample typeCastingExample = new TypeCastingExample();
		typeCastingExample.explicitCasting();
		
		TypeCastingExample.integerToString();
		
		//output 
		//0
		//null
	}

}
