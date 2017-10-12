package hackerank;

class Calculator {

	public int power(int n, int p) throws Exception 
	{
		int answer=0;
		if(n>=0 && p>=0)
		{
			answer = (int) Math.pow(n, p);
		}
		else
		{
			throw new Exception("n and p should be non-negative");
		}
		
		return answer;
	}

}
