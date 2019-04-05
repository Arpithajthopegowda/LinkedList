package LinkedList;
public class LinkedList {

	private Node head;
	
	public void InsertAtStart(int data)
	{
		Node n = new Node(data);
		n.setNextNode(this.head);
		this.head = n;
	}
	public void delete()
	{
		this.head=this.head.getNextNode();
	}
	public int length()
	{
		int len=0;
		Node current = this.head;
		while(current!=null)
		{
			len++;
			current=current.getNextNode();
		}
		return len;
	}
	
	public void Reverse(LinkedList l) 
	{
		Node current= l.head;
		Node prev=null;
		Node next;
		while(current!=null)
		{
			next = current.getNextNode();	
			current.setNextNode(prev);
			prev = current;
			current= next;
		}
		l.head=prev;
	}
	@Override
	public String toString() {
		String result="";
		Node current = this.head;
		while(current!=null)
		{
			result = result+current.toString();
			current=current.getNextNode();
		}
		return result;
	}
}
