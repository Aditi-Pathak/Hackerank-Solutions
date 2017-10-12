package hackerank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	static void levelOrder(NodeBFS root){

		if(root != null) 
		{   
			Queue<NodeBFS> queue = new LinkedList<NodeBFS>();
			queue.add(root);

			while(!queue.isEmpty())
			{
				NodeBFS n = queue.poll();
				
				if(n.left != null)
				{
					queue.add(n.left);
				}
				
				if(n.right != null)
				{
					queue.add(n.right);
				}
				
				System.out.print(n.data +" ");
				
			}
		}
	}


		public static NodeBFS insert(NodeBFS root,int data){
			if(root==null){
				return new NodeBFS(data);
			}
			else{
				NodeBFS cur;
				if(data<=root.data){
					cur=insert(root.left,data);
					root.left=cur;
				}
				else{
					cur=insert(root.right,data);
					root.right=cur;
				}
				return root;
			}
		}
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			NodeBFS root=null;
			while(T-->0){
				int data=sc.nextInt();
				root=insert(root,data);
			}
			levelOrder(root);

			sc.close();
		}	
	}

