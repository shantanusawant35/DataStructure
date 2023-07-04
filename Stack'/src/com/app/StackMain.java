package com.app;

import java.util.Scanner;

class Stack {
	private int[] arr;
	private int top;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int val) {
		if (isFull()) {
			throw new RuntimeException("stack is Empty");
		}
		top++;
		arr[top] = val;
	}

	public void pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		top--;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}
}

public class StackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack(6);
		int choice, val;
		do {
		System.out.println("\n0. Exit\n1. Push\n2. pop\n3. peek\n Enter choice: ");
		choice = sc.nextInt();
		
			switch (choice) {
			case 1: // push
				try {
					System.out.println("Enter value to push");
					val = sc.nextInt();
					s.push(val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2: // pop
				try {
					val = s.peek();
					s.pop();
					System.out.println("Popped: " + val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3: // peek
				try {
					val = s.peek();

					System.out.println("Popped: " + val);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
		} while (choice != 0);
	}
}
