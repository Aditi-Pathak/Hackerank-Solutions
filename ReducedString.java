package hackerank_Algorithm_Datastructures;

import java.util.Scanner;

public class ReducedString 
{
	static String super_reduced_string(String s){
		boolean shouldCheckAgain = true;
		
		while(shouldCheckAgain)
		{
			boolean isDuplicateFound = false;
			
			for(int i=0; s.length()>1 && i<s.length()-1; i++)
			{
				if(s.charAt(i) == s.charAt(i+1))
				{
					isDuplicateFound = true;
					String s1 = s.substring(i+2);
					String s2 = s.substring(0, i);
					s = s2.concat(s1);
				}
			}
			if(isDuplicateFound)
			{
				shouldCheckAgain = true;
			}
			else
			{
				shouldCheckAgain = false;
			}
		}
		
		if(s.isEmpty())
		{
			return "Empty String";
		}
		else
		{
			return s;
		}
    }

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
        
        in.close();
    }
}
