
public class BST<T>
{
	int root;
	BST<T> left;
	BST<T> right;

	public BST() 
	{

	}

	public BST(int elt) 
	{
		root = elt;
		left = null;
		right = null;

	}

	public boolean isEmpty() {
		return false;
	}

	public int cardinality() {

		if(this.left == null && this.right == null)
		{
			return 1;
		}
		else if(this.left == null)
		{

			return 1 + right.cardinality();
		}
		else if(this.right == null)
		{

			return 1 + left.cardinality();
		}
		else
		{
			return 1 + left.cardinality() + right.cardinality();
		}

	}

	public boolean member(int elt) {
		if(root == elt)
		{
			return true;
		}
		else
		{
			if(elt<root)
			{
				return left.member(elt);
			}
			else
			{
				return right.member(elt); 
			}
		}
	}

	public static BST<Integer> add(BST<Integer> tree,int elt)
	{
		if(tree==null)
		{
			return new BST<Integer> (elt);
		}
		else
		{
			BST<Integer> cur;
			if(elt<=tree.root)
			{
				cur=add(tree.left,elt);
				tree.left=cur;
			}
			else
			{
				cur=add(tree.right,elt);
				tree.right=cur;
			}
			return tree;
		}
	}

}

