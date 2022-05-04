
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
	void addNodeAtLastPostion(int data)
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
}
