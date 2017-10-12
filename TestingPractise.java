package hackerank;

import java.util.Scanner;

public class TestingPractise 
{
	public static String classCanceled(int threshhold, int[] time)
	{
		int count=0;
		String result=null;
		for(int i=0; i<time.length; i++)
		{
			if(time[i]>=0)
			{
				count = count+1;
			}
		}
		if(count>=threshhold)
		{
			result= "NO";
		}
		else
		{
			result= "YES";
		}
		return result;
	}
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		//boolean isPositive = false, isNegative = false, isZero = false;
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			//TestersPractise.validateValues(t, n, k);
			//TestersPractise.uniqueStudentNumber(n);
			
			int[] arrivalTime= new int[n];

			/*for (int i=0; i<n; i++)
			{
				arrivalTime[i] = sc.nextInt();

				if(arrivalTime[i]>0)
				{
					isPositive = true;
				}
				else if(arrivalTime[i]<0)
				{
					isNegative = true;
				}
				else
				{
					isZero = true;
				}
			}*/
			//TestersPractise.validateArray(arrivalTime, isPositive, isNegative, isZero);
			System.out.println();
			System.out.println(classCanceled(k, arrivalTime));
		}
		sc.close();
	}

}
