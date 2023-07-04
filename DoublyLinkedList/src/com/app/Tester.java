package com.app;

public class Tester {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addEnd(10);
		list.addEnd(20);
		
		list.addEnd(30);
		list.addEnd(40);
		list.displayForword();
		System.out.println();
		list.addBeginen(0);
		list.addBeginen(1);
		list.addBeginen(2);
		list.displayForword();
		System.out.println();
		list.addAtPosition(2000, 1);
		list.displayForword();
	}
}
