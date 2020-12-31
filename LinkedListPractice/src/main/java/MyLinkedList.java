import java.util.Iterator;

public class MyLinkedList<K> {
	
	public INode head;
	public INode tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {   //Add Method
		
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
			
		}
		
	}
	
	public void printMyNodes() {    //Print values Method
		
		StringBuffer myNodes = new StringBuffer("My Nodes:");
		INode tempNode = head;
		while(tempNode.getNext() !=null){
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
			tempNode = tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
			
			
	}

	public void append(INode<K> myNode) {    //Append Method
	
	
		if(this.head == null) {
			this.head = myNode;
		}
		if(this.tail == null) {
			this.tail = myNode;
		}else {
			this.tail.setNext(myNode);
			this.tail = myNode;
	    }
	}
	
	public void insert(INode myNode , INode newNode) {  //Insert Method
		
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
		
	}
	
	public INode pop() {                         //Pop Method
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public INode<K> search(K key){
		INode<K> tempNode = head;
		while(tempNode != null && tempNode.getNext() != null) {
			if(tempNode.getKey().equals(key)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}
	
}
	
		


