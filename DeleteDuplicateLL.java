import java.util.*;

class DeleteDuplicateLL
{
	Node head;
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
		}
		
	}
	
	void insert(Node head,int d)
	{
		Node temp = new Node(d);
		
		if(head == null)
		{
			this.head = temp;
		}
		else
		{
			Node p = head;
			
			while(p.next != null)
			{
				 p = p.next;
			}
			p.next = temp;
		}
	}
	
	void display(Node head)
	{
		if(head.next == null)
		{
			System.out.println(head.data);
			return;
		}
		else
		{
			System.out.print(head.data+" ");
			display(head.next);
		}
	}
		
		
	void delete(Node head)
	{
		Node a = head;
		
		while(a.next.next != null)
		{
			Node p = head;
			Node q = p.next;
			
			while(p.next != null && q.next != null)
			{
				if(p.data == q.data)
				{
					p.next = q.next;
				}
				
				p = p.next;
				q = q.next;
			}
			
				if(p.data == q.data)
				{
					p.next = q.next;
				}
				
			a = a.next;
		}
	}
		
	
	/*void delete(Node head)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		Node p = head;
		
		while(p != null)
		{
			if( !(l.contains(p.data)) )
			{
				l.add(p.data);
			}
			
			p = p.next;
		}
		
		System.out.println(l);
		
		
		Node q = head;
		
		for(int i=0;i<l.size() && q.next != null;i++)
		{
			q.data = l.get(i);
			
			q = q.next;
		}
		
		q.next = null;
	}*/

		
	
				
				
	public static void main(String args[])
	{
		DeleteDuplicateLL obj = new DeleteDuplicateLL();
		
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		obj.insert(obj.head,1);
		obj.insert(obj.head,2);
		obj.insert(obj.head,3);
		obj.insert(obj.head,3);
		obj.insert(obj.head,4);
		obj.insert(obj.head,5);
		obj.insert(obj.head,6);
		obj.insert(obj.head,6);
		
		obj.display(obj.head);
		
		obj.delete(obj.head);
		obj.display(obj.head);
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		