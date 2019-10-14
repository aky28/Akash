package tree;

import java.util.ArrayList;

public class LCA {
	Node rootNode;
	static int n=0,count1=0,count2=0;
	ArrayList<Integer> first=new ArrayList<Integer>();
	ArrayList<Integer> second=new ArrayList<Integer>();
	public void lowestCommonAncestor(Node rootNode,int i)
	{
	     if(rootNode.data==i)
	     {
	    	 first.add(rootNode.data);
	    	 return;
	     }
	     else if(rootNode.data<i)
	     {
	    	 first.add(rootNode.data);
	    	 if(rootNode.right!=null)
	    	   lowestCommonAncestor(rootNode.right,i);
	     }
	     else
	     {
	    	 first.add(rootNode.data);
	    	 if(rootNode.left!=null)
	    		 lowestCommonAncestor(rootNode.left,i);
	     }
	    	 
	}
	
	public void lowestCommonAncestors(Node rootNode,int i)
	{
	     if(rootNode.data==i)
	     {
	    	 second.add(rootNode.data);
	    	 return;
	     }
	     else if(rootNode.data<i)
	     {
	    	 second.add(rootNode.data);
	    	 if(rootNode.right!=null)
	    	   lowestCommonAncestors(rootNode.right,i);
	     }
	     else
	     {
	    	 second.add(rootNode.data);
	    	 if(rootNode.left!=null)
	    		 lowestCommonAncestors(rootNode.left,i);
	     }
	    	 
	}
	
	public static void main(String[] args) {
		LCA l=new LCA();
		l.rootNode=new Node(20);
		l.rootNode.left=new Node(8);
		l.rootNode.right=new Node(22);
		l.rootNode.left.right=new Node(12);
		l.rootNode.left.left=new Node(4);
		l.rootNode.left.right.left=new Node(10);
        l.rootNode.left.right.right=new Node(14);
        l.lowestCommonAncestor(l.rootNode,22);
        l.lowestCommonAncestors(l.rootNode,14);
        System.out.println("first tree");
        for(int i=0;i<l.first.size();i++)
          System.out.print(l.first.get(i)+" ");
        System.out.println();
        System.out.println("second tree");
        for(int i=0;i<l.second.size();i++)
            System.out.print(l.second.get(i)+" ");
        for(int i=0;i<l.second.size();i++)
        {
        	if(l.first.contains(l.second.get(i)))
        		n=l.second.get(i);
        	else
        		break;
        }
        for(int i=0;i<l.first.size();i++)
        {
        	if(l.first.get(i)!=22)
        		count1++;
        }
        for(int i=0;i<l.second.size();i++)
        {
        	if(l.second.get(i)!=14)
        		count2++;
        }
        System.out.println("Answer "+(count2+count1));
	}

}
