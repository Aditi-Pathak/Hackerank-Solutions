package hackerank;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] a)
	{
		elements = a;
	}

	public void computeDifference() 
	{
		int n  = 0;
		for(int i=0; i<elements.length; i++)
		{
			for(int j=i+1; j<elements.length; j++)
			{
				n = elements[j] - elements[i];
				Math.abs(n);
				if(Math.abs(n)>maximumDifference)
				{
					maximumDifference = Math.abs(n);
				}
			}

		}

	}
}
