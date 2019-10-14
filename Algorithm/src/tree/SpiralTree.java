package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class SpiralTree {
    Node root;
    Stack<Node> s2=new Stack<Node>();
    Stack<Node> s1=new Stack<Node>();
    int count=0;
	public static void main(String[] args) {
		SpiralTree tree=new SpiralTree();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(7); 
        tree.root.left.right = new Node(6); 
        tree.root.right.left = new Node(5); 
        tree.root.right.right = new Node(4);
		tree.s1.push(tree.root);
		tree.spiral(tree.s1,tree.s2);
	}

	public void spiral(Stack s1,Stack s2)
	{
		if(s1.isEmpty() && s2.isEmpty())
			return;
		
		
		else
		{
			//System.out.println("else");
			while(!s1.isEmpty() || !s2.isEmpty())
			{
				//System.out.println("s1 n s2");
				while(!s1.isEmpty())
				{
					//System.out.println("s1");
					Node x=(Node) s1.peek();
					s1.pop();
					System.out.print(x.data+" ");
					if(x.right!=null)
					{
						s2.push(x.right);
					}
					if(x.left!=null) {
						s2.push(x.left);
					}
					
				}
				while(!s2.isEmpty())
				{
					//System.out.println("s2");
					Node x=(Node) s2.peek();
					s2.pop();
					System.out.print(x.data+" ");
					
					if(x.left!=null)
					{
						s1.push(x.left);
					}
					if(x.right!=null)
					{
						s1.push(x.right);
					}
				}
			}
		}
		
	}
}
