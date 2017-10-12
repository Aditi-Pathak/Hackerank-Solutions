	package hackerank;

import java.util.Scanner;

public class SolutionLinkedList 
{
	public static NodeLinkedList removeDuplicates(NodeLinkedList head) 
	{
		NodeLinkedList current=head;
		NodeLinkedList next_next=current.next;
		
		if(head == null)
		{
			return head;
		}

		while(current.next!=null)
		{
				if(current.data==current.next.data)
				{
					next_next = current.next.next;
					current.next = null ;
					current.next = next_next;
				}
				else
				{
					current = current.next;
				}
		}

		return head;

	}

	public static  NodeLinkedList insert(NodeLinkedList head,int data)
	{
		NodeLinkedList p=new NodeLinkedList(data);	

		if(head==null)
		{
			head=p;
		}
		else if(head.next==null)
		{
			head.next=p;
		}
		else
		{
			NodeLinkedList start=head;
			while(start.next!=null)
			{
				start=start.next;
			}
			start.next=p;
		}
		return head;
	}
	public static void display(NodeLinkedList head)
	{
		NodeLinkedList start=head;
		while(start!=null)
		{
			System.out.print(start.data+" ");
			start=start.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		NodeLinkedList head=null;
		int T=sc.nextInt();
		while(T-->0){
			int ele=sc.nextInt();
			head=insert(head,ele);
		}
		head=removeDuplicates(head);
		display(head);
		sc.close();

	}
}
