package com.app;

public class DoublyLinkedList {
	
	private Node head;
	
	public DoublyLinkedList() {
		head=null;
		
	}
	
	public void displayForword() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node trav=head;
			while(trav !=null) {
				System.out.print(trav.getData()+"   ");
				trav=trav.getNext();
			}
		}
	}
	
	public void addEnd(int val) {
		Node newNode= new Node(val);
		
		if(head==null) {
			head=newNode;
		}else {
			Node trav=head;
			while(trav.getNext()!=null) {
				trav=trav.getNext();
			}
			
			trav.setNext(newNode);
			newNode.setPrev(trav);
		}
	}
	
	public void addBeginen(int val) {
		Node newNode= new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			newNode.setNext(head);
			head.setPrev(newNode);
			head=newNode;
		}
	}
	
	public void addAtPosition(int val,int pos) {
		Node newNode = new Node(val);
		if(head==null || pos==1) {
			addBeginen(val);
		}else {
			Node trav = head;
			for(int i=1;i<pos-1;i++) {
				trav=trav.getNext();
			}
			trav.getNext().setPrev(newNode);
			newNode.setNext(trav.getNext());
			newNode.setPrev(trav);
			trav.setNext(newNode);
			
		}
	}
}
