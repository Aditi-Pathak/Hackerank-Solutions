
public class TestersBST 
{
	public static void checkIsEmpty(Tree t)
	{
		if(t instanceof EmptyBST)
		{
			if(t.isEmpty())
			{
				System.out.println("All is good the tree is an Empty BST and it is empty");
			}
		}
		else if(t instanceof NonEmptyBST)
		{
			if(t.isEmpty())
			{
				System.out.println("All is good the tree is an Non Empty BST and it is non empty");
			}
		}
	}

}
