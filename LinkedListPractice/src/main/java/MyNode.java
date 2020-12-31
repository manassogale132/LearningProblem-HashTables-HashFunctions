
public class MyNode<K> implements INode<K> {
	
	private K key;
	private INode<K> next;
	
	
	public MyNode(K key) {
		super();
		this.key = key;
	}


	public K getKey() {
		return key;
	}


	public void setKey(K key) {
		this.key = key;
	}


	public INode getNext() {
		return next;
	}


	public void setNext(INode next) {
		this.next = (INode<K>) next;
	}


	public void serKey(K key) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
