package tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {
    static Node root;
    static LinkedList<Node> n=new LinkedList<Node>();
    
    public static void BFS(Node x)
    {
    	if(x==null)
    		return;
    	else
    	{
    		n.add(x);
    		while(true)
    		{
    			int count=n.size();
    			if(count==0)
    				break;
        		while(count>0) {
        			System.out.print(n.getFirst().data+" ");
        			if(n.getFirst().left!=null)
        			  n.add(n.getFirst().left);
        			if(n.getFirst().right!=null)
        			  n.add(n.getFirst().right);
        			n.removeFirst();
        			count--;
        		}
        		System.out.println();
    		}
    	}
    }
	public static void main(String[] args) {
		root=new Node(20);
		root.left=new Node(8);
		root.right=new Node(22);
		root.left.left=new Node(4);
		root.left.right=new Node(12);
		root.left.right.left=new Node(10);
		root.left.right.right=new Node(14);
		BFS(root);
	}

}
