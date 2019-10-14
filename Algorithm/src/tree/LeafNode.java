package tree;

import java.util.ArrayList;

public class LeafNode {
    static Node root; 
    ArrayList<Node> visited=new ArrayList<Node>();
    ArrayList<Node> l=new ArrayList<Node>();
	public static void main(String[] args) {
		
		root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.right=new Node(4);
		root.right.left=new Node(5);
		root.right.right=new Node(8);
		root.right.left.left=new Node(6);
		root.right.left.right=new Node(7);
		root.right.right.left=new Node(9);
		root.right.right.right=new Node(10);
		
	  LeafNode l=new LeafNode();
		l.leafNode(root);
	
		for(int i=0;i<l.l.size();i++)
			System.out.print(l.l.get(i).data+" ");
	}
	
	public void leafNode(Node x)
	{
		visited.add(x);
		//System.out.println(x.data);
		if(x.left==null && x.right==null)
			l.add(x);
		
		if(x.left!=null && !(visited.contains(x.left)))
			leafNode(x.left);
		if(x.right!=null && !(visited.contains(x.right)))
			leafNode(x.right);
		
	}

}
