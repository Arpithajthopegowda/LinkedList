package LinkedList;

public class Node {

	private int data;
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return NextNode;
	}

	public void setNextNode(Node nextNode) {
		NextNode = nextNode;
	}

	private Node NextNode;
	
	public Node(int data)
	{
		this.data=data;
	}
	@Override
	public String toString()
	{
		return "Data: "+ this.data;
	}
	
}
