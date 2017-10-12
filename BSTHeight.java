package hackerank;

import java.util.Scanner;

public class BSTHeight 
{
	public static int getHeight(NodeBST root)
	{
		if (root == null)
		{

			  return -1;
		}
		else
		{
			return Math.max(getHeight(root.left),getHeight(root.right))+1;
		}
	}

	public static NodeBST insert(NodeBST root,int elt)
	{
		if(root==null)
		{
			return new NodeBST(elt);
		}
		else
		{
			NodeBST cur;
			if(elt<=root.data)
			{
				cur=insert(root.left,elt);
				root.left=cur;
			}
			else
			{
				cur=insert(root.right,elt);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		NodeBST root=null;
		while(T-->0)
		{
			int data=sc.nextInt();
			root=insert(root,data);
		}
		int height=getHeight(root);
		System.out.println(height);
		sc.close();
	}	
}
