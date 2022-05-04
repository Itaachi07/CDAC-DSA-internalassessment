
public class LinkedList 
{
	static class Node
	{
		private Vehicle data;
		private Node prev;
		private Node next;
		
		Node(Vehicle vehicle)
		{
			this.data=vehicle;
			this.prev=null;
			this.next=null;
		}
	}
	private Node head;
	private int nodesCount;
	
	LinkedList()
	{
		head = null;
		nodesCount = 0;
	}
	boolean isListEmpty()
	{
		return(head == null);
	}
	int getNodesCount()
	{
		return(this.nodesCount);
	}
	
	
	void addNodeAtLastPosition(Vehicle v)
	{
		v= new Vehicle();
		v.acceptDetails();
		Node newNode = new Node(v);
		
		if(isListEmpty())
		{
			head = newNode;
			nodesCount++;
			
		}
		else {
			Node trav = head;
			while(trav.next!=null)
			{
				trav = trav.next;
			}
			
			trav.next = newNode;
			newNode.prev = trav;
			nodesCount++;
		}
	}
	
	void addNodeAtFirstPosition(Vehicle v)
	{
		Node newNode = new Node(v);
		v.acceptDetails();
		if(isListEmpty())
		{
			head = newNode;
			nodesCount++;
		}else {
				newNode.next = head;
				head.prev = newNode;
				head = newNode;
				nodesCount++;
			  }
	 }
	void deletNodeAtFirstPosition()
	{
		if(isListEmpty())
		{
			throw new RuntimeException("List is Empty");
		}
		else if (head.next == null)
		{
			head = null;
			nodesCount--;
		}
		else {
				head = head.next;
				head.prev = null;
				nodesCount--;
			}
	}
	
	void deleteNodeAtLastPosition()
	{
		if(isListEmpty())
		{
			throw new RuntimeException("List is Empty");
		}
		else if(head.next == null)
		{
			head = null;
			nodesCount--;
		}
		else
		{
			Node trav = head;
			while(trav.next.next !=null)
			{
				trav = trav.next ;
			}
			trav.next =null;
		}
	}
	
	void displayList()
	{
		if (isListEmpty())
		{
			throw new RuntimeException("List is Empty");
		}
		else {
				Node trav = head;
				Node temp = null;
				System.out.println("List in Forward Direction is : ");
				
				while(trav != null)
				{
					temp = trav ;
					System.out.println(" " +trav.data );
					trav = trav.next;
				} //System.out.print();
				
			 }
	}
	
	void revdisplayList()
	{
		if(isListEmpty())
		{
			throw new RuntimeException("List is Empty");
		}
		else {
			Node trav = head;
			Node temp = null;
			System.out.print("List in Reverse Direction is : ");
			while(trav != null)
			{
				temp = trav ;
				trav = trav.next;
			}
			trav = temp;
			while (trav!=null)
			{
				temp = trav;
				System.out.print(" " +trav.data);
				trav = trav.prev;
			} System.out.println();
		}
			
	}
}
