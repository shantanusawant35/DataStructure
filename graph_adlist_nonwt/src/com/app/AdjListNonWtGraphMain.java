package com.app;

import java.util.LinkedList;
import java.util.Scanner;

class AdjListNonWtGraph{
	private int vertCount,edgeCount;
	private LinkedList<Integer>[] adjlist;
	public AdjListNonWtGraph(int vertexCount) {
		vertCount=vertexCount;
		edgeCount=0;
		adjlist= new LinkedList[vertCount];
		for(int i=0;i<vertCount;i++) {
			adjlist[i]=new LinkedList<Integer>();
		}
	}
	public void accept(Scanner sc){
		System.out.println("Enter number of edges: ");
		edgeCount=sc.nextInt();
		for(int i=0;i<edgeCount;i++) {
			System.out.println("Enter edge (src dest");
			int src=sc.nextInt();
			int dest=sc.nextInt();
			adjlist[src].add(dest);
			adjlist[dest].add(src);  // for directed graph delet this line
		}
	}
	public void display() {
		for(int v=0;v<vertCount;v++) {
			System.out.print("vert "+v);
			for(int dest: adjlist[v]) {
				System.out.print(dest+" -> ");
			}
			System.out.println();
		}
	}
}
public class AdjListNonWtGraphMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices");
		int vertCount= sc.nextInt();
		AdjListNonWtGraph g= new AdjListNonWtGraph(vertCount);
		g.accept(sc);
		g.display();
		sc.close();
	}
}
