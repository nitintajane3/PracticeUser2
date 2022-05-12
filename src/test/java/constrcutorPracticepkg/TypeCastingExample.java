package constrcutorPracticepkg;



public class TypeCastingExample 
{
	

	public void explicitCasting() 
	{	
		double yk = 5;
		float  kg = (float) yk;
		long b = (long) kg;
		int a = (int) b;
		short gh = (short) a;
		byte g = (byte) gh;
		
		System.out.println("printing the byte data : " + g);
		System.out.println("printing the int data : " + a);
		System.out.println("printing the float data : " + kg);
		
		double testint = 34;
		int printdouble = (int) testint;
		
		System.out.println("printing integer data : " + printdouble);
	}
	
	public static void integerToString()
	{
		int a = 12;
		String str = String.valueOf(a);
		System.out.println("print integer to string :" + str);
		/*System.out.println();*/
		
		// second way to convert
		
		String str2 = Integer.toString(a);
		System.out.println("second way print integer to string :" + str2);
	}
	
	public static void stringToInteger()
	{
		String intString = " 4646 ";
		String rer = intString.trim();
		int test = Integer.parseInt(rer);
		System.out.println("convert String to intger : " + test);
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		// implicit casting 
		byte g = 3;
		short gh =g;
		int a = gh;
		long b = a;
		float  kg = g;
		double yk = kg;
		System.out.println("double value : " + yk);
		
		// explicit casting
		long d = 3;
		int s = (int) d;
		
		
		
		/*TypeCastingExample typeCastingExample = new TypeCastingExample();
		typeCastingExample.explicitCasting();*/
		
		stringToInteger();
		
		
		/*int i = 100;
	      long l = i; //no explicit type casting required
	      float f = l;  //no explicit type casting required
	      System.out.println("Int value "+i);
	      System.out.println("Long value "+l);
	      System.out.println("Float value "+f);
	      
	      
	      double dd = 100.04;
	      long ll = (long)dd;  //explicit type casting required
	      int ii = (int)ll; //explicit type casting required

	      System.out.println("Double value "+dd);
	      System.out.println("Long value "+ll);
	      System.out.println("Int value "+ii);*/
	}

}
