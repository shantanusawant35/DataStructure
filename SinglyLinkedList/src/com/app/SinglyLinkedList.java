package com.app;

public class SinglyLinkedList {
	private Node head;
	
	public void addEnd(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
		}else {
			Node trav= head;
			while(trav.getNext() != null) {
				trav= trav.getNext();
			}
			trav.setNext(newNode);
		}
	}
	
//	public void revrse() {
//		Node oldhead= head;
//		head= null;
//		while(oldhead != null) {
//		// delete first temp from old list 
//		Node temp= oldhead;
//		oldhead = oldhead.getNext();
//		// add first (temp) to new list
//		temp.setNext(head);
//		head = temp;
//		}
//	}
	
	public void revrse() {
		reverseSinglyList(head);
	}
	private void reverseSinglyList(Node head2) {
	if(head2!=null) {
	reverseSinglyList(head2.getNext());
	System.out.print(head2.getData()+ "  ");
	}
	
}

	public void dispalyForword() {
		Node trav = head;
		
		while(trav!= null) {
			System.out.print(trav.getData()+"  ");
			trav=trav.getNext();
		}
	}
}
