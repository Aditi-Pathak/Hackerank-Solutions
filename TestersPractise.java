package hackerank;

import java.util.ArrayList;
import java.util.List;

public class TestersPractise 
{
	public static void validateValues(int t, int n, int k) throws Exception
	{
		System.out.println("Inside validateValues the values of t, n, k "
				+ "is "+t+" "+n+" "+k);
		if(t>4)
		{
			throw new Exception("The value of t is greater than 5, which is invalid");
		}
		else if(n<3 || n>200)
		{
			throw new Exception("The value of n should be between 3 to 200 inclusive");
		}
		else if(k<1 || k>n)
		{
			//throw new Exception("The value of k should be between 1 to n inclusive");
		}
	}
	
	public static void validateArray(int[] timeValues, boolean isPositive, boolean isNegative, boolean isZero) throws Exception
	{
		for(int i=0; i<timeValues.length; i++)
		{
			if(timeValues[i]< -10000 || timeValues[i]> 10000)
			{
				throw new Exception("Time should not be less than -10000 or greater than 10000, "
						+ "your time of entry to class is invalid");
				
			}
			else if(!(isPositive == true && isNegative == true && isZero == true))
			{
					throw new Exception("Time values should have atleast one positive, negative and zero, "
							+ "the time of entry mentioned are not valid");
			}
			
		}
	}
	
	/*public static void uniqueStudentNumber(int n) throws Exception
	{
		List<Integer> list = new ArrayList<Integer> ();
		System.out.println("Inside uniqueStudentNumber the value of"
				+ " n is "+n);
		
		if(!(list.contains(n)))
		{
			System.out.println("Inside if to add the value to set");
			list.add(n);
			for(int i=0; i<list.size(); i++)
			{
				System.out.println("the values in set are"+list.get(i));
			}
		}
		else
		{
			throw new Exception("The value of n must be unique for all the test cases");
		}
	}
*/
	
}
