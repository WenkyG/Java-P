/*
Node class
*/
class Node {
	public Node next;
	private int value;

	Node(int v){
		this.next = null;
		this.value = v;
	}
	public void setNext(Node n){
		this.next = n;
	}
	public Node getNext(){
		return this.next;
	}
	public void setValue(int v){
		this.value = v;
	} 
	public int getValue(){
		return this.value;
	}
}
/*
Main Linked List class
*/
class LinkedList{
	public Node head;
	public Node tail;

	LinkedList(){
		this.head = null;
		this.tail = null;
	}

	public void insert(int value){
		Node node_obj = new Node(value);
		if(head == null){
			head = node_obj;
			tail = head;
		} else {
			tail.setNext(node_obj);
			tail = node_obj;
		}
	}

	public void reverse(){
		Node t1 = head;
		Node t2 = head.getNext();
		t1.next = null;
		while(t2!=null){
			Node t3 = t2.getNext();
			if(t3 == null)
				head = t2;
			t2.setNext(t1);
			t1 = t2;
			t2 = t3;
		}
	}

	public void printLL(){
		Node start = head;
		while(start!=null){
			if(start.getNext()==null)
				System.out.print(start.getValue());
			else
				System.out.print(start.getValue() + "-");
			start = start.getNext();
		}
	}
}

class LLMain{
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.insert(7);
		obj.insert(6);
		obj.insert(5);
		obj.insert(4);
		obj.insert(3);
		obj.insert(2);
		obj.printLL();
		obj.reverse();
		System.out.println();
		obj.printLL();
	}
}
