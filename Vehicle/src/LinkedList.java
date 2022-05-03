
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
	
}
