package SecondPackage;



public class InterviewProgram 
{
	static char[] alphabet = "god".toCharArray();

    static void generate(StringBuilder sb, int n) {
        if (n == sb.length()) {
            System.out.println(sb.toString());
            return;
        }
        for (char letter : alphabet) {
            sb.setCharAt(n, letter);
            generate(sb, n + 1);
        }
    }
	
	
	static void printPermutn(String str, String ans)
    {
 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                         str.substring(i + 1);
 
            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        for (int length = 3; length <= 3; length++) {
            sb.setLength(length);
            generate(sb, 0);
        }
		
		/* String str = "GOD";
        printPermutn(str, "");*/
		
       
		/*int len = str.length();
		
		for (int i = 0; i < len; i++) 
		{
            for (int j = 0; j < len; j++) 
            {
                for (int k = 0; k < len; k++)
                {
                    
                        if (i != j && i != k && j != k) 
                        {
                            System.out.print(str.charAt(i));
                            System.out.print(str.charAt(j));
                            System.out.println(str.charAt(k));
                            
                        }
                    
                }
            }
        }*/
     
	}

}
