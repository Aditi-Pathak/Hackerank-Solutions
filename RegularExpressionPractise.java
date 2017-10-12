package hackerank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RegularExpressionPractise 
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> stuff=new ArrayList<String>();

		for(int a0 = 0; a0 < N; a0++)
		{
			String firstName = in.next();
			String emailID = in.next();

			if(emailID.matches(".*@gmail.com"))
			{
				stuff.add(firstName);
				Collections.sort(stuff);
			}
		}

		for(int a0 = 0; a0 < stuff.size(); a0++)
		{
			System.out.println(stuff.get(a0));
		}
		in.close();
	}

}
