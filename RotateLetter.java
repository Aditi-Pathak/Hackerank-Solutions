package hackerank_Algorithm_Datastructures;
import java.util.Scanner;

public class RotateLetter 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		System.out.println("n is "+n);
		/*char character = s.charAt(0);
		System.out.println("character is "+character);
		for(int i=0; i<n ; i++)
		{
			char character1 = s.charAt(i);
			System.out.println("character is "+character);
			int ascii = (int)character;
			System.out.println("ascii for "+character+" is "+ascii);
			System.out.println("ascii after rotation for "+character+" is "+ascii+k);
			
		}*/
		
		in.close();
	}

}
