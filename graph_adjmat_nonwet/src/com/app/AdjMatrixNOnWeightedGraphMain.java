package com.app;

import java.util.Scanner;

class AdjMatrixNOnWeightedGraph{
	private int vertCount;
	private int edgeCount;
	private int[][] adjmat;
	
	public AdjMatrixNOnWeightedGraph(int vertexCount) {
		edgeCount=0;
		vertCount=vertexCount;
		adjmat= new int [vertCount][vertCount];
		for(int i=0;i< vertCount;i++) {
			for(int j=0;j< vertCount;j++) {
				adjmat[i][j]=0;
			}
		}
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter number of edges: ");
		edgeCount = sc.nextInt();
		for(int i=0;i<edgeCount;i++) {
			System.out.print("Enter edge (src dest): ");
			int src= sc.nextInt();
			int dest=sc.nextInt();
			adjmat[src][dest]=1;
			adjmat[dest][src]=1;
		}
	}
	
	public void display() {
		System.out.println("\nAdjancecy matrix: \n");
		for(int i=0;i< vertCount;i++) {
			for(int j=0;j< vertCount;j++) {
				System.out.print(adjmat[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
public class AdjMatrixNOnWeightedGraphMain {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of vertices: ");
		int vertCount=sc.nextInt();
		AdjMatrixNOnWeightedGraph g= new AdjMatrixNOnWeightedGraph(vertCount);
		g.accept(sc);
		g.display();
		sc.close();
	}
}
