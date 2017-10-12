/*
Problem statement:
Find the next higher number with the same digits.
Given an integer, find the next higher number with the same digits.
If the number is the largest number that can be formed from the given digits, then print None.

Example:
Input:32841				Input:98765
Output:34128			Output:None
 */
package iDeserveCode;

import java.util.ArrayList;
import java.util.Scanner;

public class NextHigherNumber 
{
	/*public static void swap(int i, int j)
	{
		System.out.println("In swap method before swapping i and j are "+i+" "+j);
		int temp = 0;
		temp = i;
		i=j;
		j=temp;
		System.out.println("In swap method after swapping i and j are "+i+" "+j);
	}*/
	
	public static void calculateNextHigherNumber(int n)
	{
		int remainder = 0;
		ArrayList<Integer> list = new ArrayList<Integer> ();
		
		while(n!= 0)
		{
			remainder = n%10;
			n = n/10;
			list.add(remainder);
		}
		System.out.println();
		int t = list.size();
		for(int i =0; i<=t-1; i++)
		{
			for(int j =i+1; j<=t-2; j++)
			{
				if(list.get(i)>list.get(j))
				{
				}
			}
		}

	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		calculateNextHigherNumber(number);

		sc.close();

	}

}
