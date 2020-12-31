import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Assert;

public class MyLinkedListTest {
	
	private MyNode<Integer> linkedlist;
	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		System.out.println(" ");
		System.out.println("UC2");
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myThirdNode)&&
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myFirstNode);
		
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void given3NumbersWhenAppendedTShouldBeAddedToLast() {
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		System.out.println(" ");
		System.out.println("UC3");
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenInsertingShouldBePassLinkedListResult() {
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode,mySecondNode);
		System.out.println(" ");
		System.out.println("UC4");
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(myFirstNode)&&
				         myLinkedList.head.getNext().equals(mySecondNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumbersWhenDeleteFirstNodeShouldBePassLinkedListResult() {
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.pop();
		myLinkedList.add(myThirdNode);
		myLinkedList.add(mySecondNode);
	
		System.out.println(" ");
		System.out.println("UC5");
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(mySecondNode)&&
				         myLinkedList.head.getNext().equals(myThirdNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	
	@Test
	public void given3NumbersWhenDeleteLastNodeShouldBePassLinkedListResult() {
	
		MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.pop();
		System.out.println(" ");
		System.out.println("UC6");
		myLinkedList.printMyNodes();
		
		boolean result = myLinkedList.head.equals(mySecondNode)&&
				         myLinkedList.head.getNext().equals(myThirdNode)&&
				         myLinkedList.tail.equals(myThirdNode);
		
		Assert.assertTrue(result);
	}
	
	@Test
	public void addThreeNumbersAndSearchRequiredNumber() {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
		
		Iterator itr = linkedlist.iterator();
		while(itr.hasNext()) {
			if((Integer) itr.next() == 30) {
				System.out.println(" ");
				System.out.println("UC7");
				System.out.println("My Nodes:30");
				
			}
		}		

	}
	
	@Test
	public void addThreeNumbersAndAddBetweenValues() {
		
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(56);
		linkedlist.add(30);
		linkedlist.add(70);
	
		linkedlist.add(2, 40);
		System.out.println(" ");
		System.out.println("UC8");
		System.out.println("My Nodes:"+linkedlist);	
		

}
}
