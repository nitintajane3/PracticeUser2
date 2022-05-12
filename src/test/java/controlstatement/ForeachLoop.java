package controlstatement;

public class ForeachLoop 
{

	public void foreachLooptest1() 
	{
		
		//Declaring an array  
	    int arr[]={12,23,44,56,78};  
	    //Printing array using for-each loop  
	    for(int i:arr)
	    {  
	        System.out.println(i);  
	    }  
	}
	
	public void looplableledTest() 
	{
		  //Using Label for outer and for loop  
	    aa:  
	        for(int i=1;i<=3;i++)
	        {  
	            bb:  
	                for(int j=1;j<=3;j++)
	                {  
	                    if(i==2&&j==2)
	                    {  
	                        break aa;  
	                    }  
	                    System.out.println(i+" "+j);  
	                }  
	        }  
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*The for-each loop is used to traverse array or collection in Java. 
		It is easier to use than simple for loop because we don't need to increment value
		and use subscript notation.

		It works on the basis of elements and not the index. It returns element one by 
		one in the defined variable.*/
		
		
		ForeachLoop foreachLoop = new ForeachLoop();
		foreachLoop.looplableledTest();
	}

}
