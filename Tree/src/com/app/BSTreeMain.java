package com.app;

import com.app.BinarySerchTree.Node;

class BinarySerchTree{
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node() {
			setData(0);
			left=null;
			right=null;
		}
		
		public Node(int val) {
			setData(val);
			left=null;
			right=null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}
	
	private Node root;
	
	public BinarySerchTree() {
		root=null;
	}
	
	void add(int val) {
		Node newNode = new Node(val);
		
		if(root==null) {
			root=newNode;
		}else {
			Node trav=root;
			while(true)
			if(val<trav.getData()) {
				if(trav.left != null) {
					trav=trav.left;
				}else {
					trav.left=newNode;
					break;
				}
			}else {
				if(trav.right != null) {
					trav=trav.right;
				}else {
					trav.right=newNode;
					break;
				}
			}
		}
	}
	public void preorder(Node trav) {
		if(trav == null) {
			return ;
		}
		System.out.print(trav.getData()+", ");
		preorder(trav.left);
		preorder(trav.right);
	}
	public void preorder() {
		preorder(root);
	}
	
	public  Node binarySerch(int val) {
		Node trav= root;
		
			while(trav != null) {
				if(trav.getData()==val) {
					return trav;
					
				}
				if(val<trav.getData()) {
					trav=trav.left;
				}
				if(val>trav.getData()) {
					trav=trav.right;
				}
			}
			
		
		
		return null;
	}
	
	public void delete(int val) {
		
		Node trav,parent;
		// find the node to be deleted along with its parent
		Node[] arr = binarySerchWithParent(val);
		trav=arr[0];
		parent=arr[1];
		// if node is not found, throw the exception
		if(trav==null) {
			throw new RuntimeException("Node not found");
		}
		// if node has left as well as right child
		if(trav.left!=null && trav.right != null) {
			
		
			// find its successor with its parent 
			parent=trav;
			Node succ=trav.right;
			while(succ.left!= null) {
				parent= succ;
				succ=succ.left;
			}
			// overwrite data of node with its successor data
			trav.data=succ.data;
			// mark successor node to be deleted
			trav=succ;
		}
		// if node has right child ( or node dosen't have left chiled)
		if(trav.left==null) {
			if(trav==root)
				root=trav.right;
			else if(trav==parent.left)
				parent.left=trav.right;
			else
				parent.right=trav.right;
		}
		// if node has left child ( or node dosen't have right chiled)
		else if(trav.right==null) {
			if(trav==root)
				root=trav.left;
			else if(trav==parent.left)
				parent.left=trav.left;
			else
				parent.right=trav.left;
		}
		
	}
	
	public Node[] binarySerchWithParent(int val) {
		Node trav=root;
		Node parent=null;
		while(trav != null) {
			if(val==trav.data) {
				return new Node[] {trav,parent};
			}
			parent = trav;
			if(val<trav.data) {
				trav=trav.left;
			}else {
				trav=trav.right;
			}
		}
		return new Node[] {null,null};
	}
}

public class BSTreeMain {
	public static void main(String[] args) {
		BinarySerchTree t = new BinarySerchTree();
		t.add(50);
		t.add(30);
		t.add(10);
		t.add(90);
		t.add(100);
		t.add(40);
		t.add(70);
		t.add(80);
		t.add(60);
		t.add(20);
		t.preorder();
		Node node = t.binarySerch(40);
		System.out.println();
		System.out.println(node.getData());
		System.out.println();
		Node[] node1=t.binarySerchWithParent(80);
		
		System.out.println(node1[0].getData()+"parent"+node1[1].getData());
		
	}
}
