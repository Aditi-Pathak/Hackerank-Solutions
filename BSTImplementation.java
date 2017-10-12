import java.util.Scanner;

public class BSTImplementation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of elements needed for the tree!!");
		int T = sc.nextInt();
		BST<Integer> tree = null;
		
		while(T-- > 0)
		{
			int elt = sc.nextInt();
			tree=BST.add(tree,elt);
		}
		System.out.println("The cardinality is "+tree.cardinality());
		sc.close();
	}

}
