package com.app;

public class Tester {
	public static void main(String[] args) {
		SinglyLinkedList sll= new SinglyLinkedList();
		sll.addEnd(5);
		sll.addEnd(89);
		sll.addEnd(78);
		sll.addEnd(89);
		sll.dispalyForword();
		System.out.println();
		sll.revrse();
		System.err.println();
		sll.dispalyForword();
	}
}
