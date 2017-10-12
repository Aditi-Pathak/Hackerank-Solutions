package hackerank;

import java.util.Scanner;

public class BitWise {

	static int solve(int N, int K) 
	{
		int result = 0;
		for (int i = 1; i <= N; i++) 
		{
			for (int j = i + 1; j <= N; j++) 
			{
				int current = i & j;
				if (current > result && current < K) 
				{
					result = current;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int a0 = 0; a0 < T; a0++) 
		{
			int N = sc.nextInt();
			int K = sc.nextInt();

			System.out.println(solve(N, K));
		}

		sc.close();
	}
}