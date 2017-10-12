package hackerank;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean checkPrime(int num)
	{
		int sqrt = (int)Math.sqrt(num);
		if(num == 1)
		{
			return false;
		}
		if(num == 2)
		{
			return true;
		}
		if(num % 2 == 0)
		{
			return false;
		}
		for (int i=3; i<=sqrt; i+=2) 
		{
			if (num % i == 0) 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		boolean isPrime = false;

		while(T-- > 0)
		{
			int num = sc.nextInt();
			isPrime = checkPrime(num);
			if(isPrime)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not prime");
			}
		}


		sc.close();
	}
}
