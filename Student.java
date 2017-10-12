package hackerank;

class Student extends Person
{

	private int[] testScores;
	String firstName;
	String lastName;
	int identification;


	Student(String firstName, String lastName, int identification, int[] testScores) 
	{
		super(firstName, lastName, identification);
		this.testScores = testScores;
	}

	public char calculate()
	{
		int average=0;
		int total= 0; 
		char grade;

		for(int i=0; i<testScores.length; i++)
		{
			total = total+testScores[i];
			average= total/testScores.length;
		}

		if(average>=90 && average <=100)
		{
			grade = 'O';
		}
		else if(average>=80 && average <90)
		{
			grade = 'E';
		}
		else if(average>=70 && average <80)
		{
			grade = 'A';
		}
		else if(average>=55 && average <70)
		{
			grade = 'P';
		}
		else if(average>=40 && average <55)
		{
			grade = 'D';
		}
		else
		{
			grade = 'T';
		}

		return grade;

	}
}
