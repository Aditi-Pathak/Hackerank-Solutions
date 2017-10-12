package hackerank;

import java.util.Scanner;

public class SolutionException {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		try
		{
			int result = Integer.parseInt(S);
			System.out.println("The result is "+result);
			
		}
		catch(Exception e)
		{
			System.out.println("Bad String");
		}
		in.close();
	}
}


