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
	
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = head;
		head = newNode;
	}
	
	public void deleteFirst() {
		head = head.next;
	}
	
	public void insertAfter(String data, Node after) {
		if (after != null) {
			Node newNode = new Node();
			newNode.record = data;
			newNode.next = after.next;
			after.next = newNode;
		}
	}
	
	public Node findNode(String data) {
		Node pointer = head;
		while (pointer != null && !pointer.record.equals(data)) {
			pointer = pointer.next;
		}
		return pointer;
	}
	
	public void deleteNode(Node trash) {
		if (trash != null) {
			Node follower = head;
			while (follower.next != trash) {
				follower = follower.next;
			}
			follower.next = trash.next;
		}
	}
	
	public void insertLast(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = null;
		if (head != null) {
			Node pointer = head;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			pointer.next = newNode;
		} else {
			head = newNode;
		}
	}
	
	public void deleteLast() {
		if (head != null) {
			Node pointer = head;
			while (pointer.next != null) {
				pointer = pointer.next;
			}
			Node follower = head;
			while (follower.next != pointer) {
				follower = follower.next;
			}
			follower.next = null;
		}
	}
	
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
	
}
