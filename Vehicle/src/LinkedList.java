
public class LinkedList 
{
	static class Node
	{
		private Vehicle data;
		private Node prev; //reference of type node class
		private Node next;	//reference of type node class
		
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
	boolean isListEmpty() //To check the list is empty
	{
		return(head == null);
	}
	int getNodesCount() 
	{
		return(this.nodesCount);
	}
	
	
	void addNodeAtLastPosition(Vehicle v) //Add node at Last Position
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
	
	void addNodeAtFirstPosition(Vehicle v) //Add node at First Position
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
	void deletNodeAtFirstPosition() //Delete node at First Position
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
	
	void deleteNodeAtLastPosition() //Delete node at Last Position
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
	
	void displayList() //method to display list
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
	
	void revdisplayList() //method to display List in reverse order
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
	void sortbyPrice(int price) //method for Sort using price of vehicle
	{
		if (isListEmpty())
		{
			throw new RuntimeException("List is Empty");	
		}
		else 
		{
			System.out.println("Sorted List IS :");
			for(Node trav1 = head; trav1.next!=null; trav1 =trav1.next) //First loop for Iterations
			{
				for(Node trav2 = trav1.next;trav2.next!=null;trav2 = trav2.next)
				{
					if(trav1.data.getPrice() > trav2.data.getPrice())
					{
						Vehicle temp = trav1.data;
						trav1.data = trav2.data;
						trav2.data=temp;
					}
				}
			}
		}
		displayList();
	}
	
}
