package com.app;

import java.util.LinkedList;
import java.util.Scanner;

class HashTable{
	static class Pair{
		private int key; //key=roll
		private String value; // value= name -- Student object
		public Pair() {
			this.key=0;
			this.value=" ";
			
		}
		public Pair(int key,String value) {
			this.key=key;
			this.value=value;
		}
		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
			
	}
	private static final int SLOTS=10;
	private LinkedList<Pair> table[];
	
	public int hash(int key) {
		return key % SLOTS;
	}
	
	public  HashTable() {
		table= new LinkedList[SLOTS];
		for(int i=0;i<SLOTS;i++) {
			table[i]=new LinkedList<>();
		}
	}
	
	public void put(int key,String value) {
		// find slot for given key using hash function
				int slot = hash(key);
				// access the bucket (linked list)in that slot
				
				LinkedList<Pair> bucket= table[slot];
				// find element (key value)in that bucket -- liner serch
				
				for(Pair pair: bucket) {
					// if key is duplicated, replace the value
					if(key == pair.key) {
						pair.value=value;
					}
					
				}
				// if key not found, create new pair and add into bucket
				Pair pair = new Pair(key,value);
				bucket.add(pair);
	}
	public String get(int key) {
		// find slot for given key using hash function
		int slot = hash(key);
		// access the bucket (linked list)in that slot
		
		LinkedList<Pair> bucket= table[slot];
		// find element (key value)in that bucket -- liner serch
		
		for(Pair pair: bucket) {
			if(key == pair.key) {
				return pair.value;
			}
			
		}
		// if key not found return null
		return null;
	}

	
}
public class HashTableMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashTable ht = new HashTable();
		ht.put(1, "nilesh");
		ht.put(4, "Nitin");
		ht.put(8, "Sandeep");
		ht.put(5, "Amit");
		ht.put(24, "Vishal");
		ht.put(34, "Yogesh");
		ht.put(25, "Aakash");
		
		System.out.println("Enter roll to find");
		int roll= sc.nextInt();
		String name=ht.get(roll);
		System.out.println("name found : "+ name);
		sc.close();
	}
}
