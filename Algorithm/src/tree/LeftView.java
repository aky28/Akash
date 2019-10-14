package tree;

public class LeftView {

	Node root;
	public static int max_level=0;
	
	 void leftView(Node root,int level)
	{
		if(root==null)
			return;
		if(max_level<level)
		{
			System.out.println(root.data);
			max_level=level;
		}
		
			leftView(root.left, level+1);
			leftView(root.right,level+1);
		
	}
	public static void main(String[] args) {
		LeftView tree = new LeftView(); 
        tree.root = new Node(4); 
        tree.root.left = new Node(5); 
        tree.root.right = new Node(2); 
        tree.root.right.left = new Node(3); 
        tree.root.right.right = new Node(1); 
        tree.root.right.left.left=new Node(6);
        tree.root.right.left.right=new Node(7);
        tree.leftView(tree.root,1); 

	}

}
