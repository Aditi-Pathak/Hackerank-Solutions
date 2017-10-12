package hackerank;

import java.util.ArrayList;
import java.util.Scanner;


public class NestedConditional 
{
	public static int calculateFine(ArrayList<Integer> actual, ArrayList<Integer> expected)
	{
		if((actual.get(0)) > (expected.get(0)) && (actual.get(1).equals(expected.get(1))) && ((actual.get(2).equals(expected.get(2)))))
		{
			return (15*(actual.get(0)-expected.get(0)));
		}
		else if((actual.get(1)>expected.get(1)) && ((actual.get(2).equals(expected.get(2)))))
		{
			return (500*(actual.get(1)-expected.get(1)));
		}
		else if(actual.get(2) > expected.get(2))
		{
			return 10000;
		}
		else
		{
			return 0;
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String[] actualReturnDate = sc.nextLine().split(" ");
		String[] expectedReturnDate = sc.nextLine().split(" ");
		int[] actual = new int[3];
		int[] expected = new int[3];

		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> ex = new ArrayList<>();
		
		for(int i=0; i<3; i++)
		{
			actual[i] = Integer.parseInt(actualReturnDate[i]) ;
			expected[i] = Integer.parseInt(expectedReturnDate[i]);
			al.add(actual[i]);
			ex.add(expected[i]);
		}
		System.out.println(calculateFine(al, ex));
		sc.close();
		
	}
}
