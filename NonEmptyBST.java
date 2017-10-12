@SuppressWarnings("rawtypes")
public class NonEmptyBST<D extends Comparable> implements Tree<D> 
{
	D root;
	Tree<D> left;
	Tree<D> right;

	public NonEmptyBST() 
	{

	}

	public NonEmptyBST(D elt) 
	{
		root = elt;
		left = new NonEmptyBST<D>();
		right = new NonEmptyBST<D>();

	}

	public NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) 
	{
		root = elt;
		left = leftTree;
		right = rightTree;
	}

	public boolean isEmpty() {
		return false;
	}

	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}

	@SuppressWarnings("unchecked")
	public boolean member(D elt) {
		if(root == elt)
		{
			return true;
		}
		else
		{
			if(elt.compareTo(root) < 0)
			{
				return left.member(elt);
			}
			else
			{
				return right.member(elt); 
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	public NonEmptyBST<D> add(D elt) {
		if(root == elt)
		{
			return this;
		}
		else
		{
			if(elt.compareTo(root) <0)
			{
				return new NonEmptyBST(root, left.add(elt), right);
			}
			else
			{
				return new NonEmptyBST(root, left, right.add(elt));
			}

		}
	}

}
