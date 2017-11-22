/**
 * This class implements a singly linked list data structure.
 * 
 * @author Michael Ida
 *
 */
public class LinkedList {
	
	private Node head;
	
	/*
	 * The constructor creates an empty list.
	 */
	public LinkedList() {
		head = null;
	}
	
	/*
	 * This method creates a new node and adds it to the head of the list.
	 */
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = head;
		head = newNode;
	}
	
	/*
	 * This method deletes the first node in the list.
	 */
	public void deleteFirst() {
		head = head.next;
	}
	
	/*
	 * This method should create a new node containing data and add it following the node 'after'.
	 * If after is null, then it should do nothing.
	 */
	public void insertAfter(String data, Node after) {
		if(after.next != null) {
			Node newNode = new Node();
			newNode.record = data;
			newNode.next = after.next;
			after.next = newNode;
		}
	}
	
	/*
	 * This method should find the node containing the string data and return a pointer to that node.
	 * If not found, then it should return null.
	 */
	public Node findNode(String data) {
		Node pointer = head;
		while(pointer.next != null && !pointer.record.contains(data)) {
			pointer = pointer.next;
		}
		return pointer;
	}
	
	/*
	 * This method should delete the node trash.
	 * If trash is null, then it does nothing.
	 */
	public void deleteNode(Node trash) {
		Node pointer = head, before = null;
		while(pointer.next != null && pointer != trash) {
			before = pointer;
			pointer = pointer.next;
		}
		before.next = pointer.next;
	}
	
	/*
	 * This method should create a new node and insert it at the end of the list.
	 */
	public void insertLast(String data) {
		Node newNode = new Node();
		newNode.record = data;
		
		Node pointer = head;
		if(head != null) {
			while(pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
		} else head = newNode;
		
	}
	
	/*
	 * This method deletes the last node in the list.
	 * If the list is empty, then it does nothing.
	 */
	public void deleteLast() {
		Node pointer = head, before = null;
		while(pointer.next != null) {
			before = pointer;
			pointer = pointer.next;
		}
		before.next = null;
	}
	
	/*
	 * This method transverses the list and prints out the record in each node.
	 */
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
	
}
