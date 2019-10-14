package tree;

import java.util.Scanner;


public class DFS {

	public static void main(String[] args) {
		System.out.println("Enter the total number of nodes");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Graph g=new Graph(n);
		g.add(0,1);
		g.add(0,2);
	    g.add(1,3);
		g.add(1,4);
		g.add(2,4);
		g.add(3,4);
		g.add(3,5);
        g.add(4,5);
        g.display(0);
	}

}
