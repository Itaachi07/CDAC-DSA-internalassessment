
public class LinkedList 
{
	static class Node
	{
		private int data;
		private Node prev;
		private Node next;
		
		Node(int data)
		{
			this.data=data;
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
	void addNodeAtLastPosition(int data)
	{
		Node newNode = new Node(data);
		
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
	
	void addNodeAtFirstPosition(int data)
	{
		Node newNode = new Node(data);
		
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
					System.out.println("%4d" +trav.data );
					trav = trav.next;
				} System.out.println();
				
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
			while(trav != null)
			{
				temp = trav ;
				trav = trav.next;
			}
			trav = temp;
			while (trav!=null)
			{
				temp = trav;
				System.out.println("%4d" +trav.data);
				trav = trav.prev;
			} System.out.println();
		}
			
	}
}
