package morgan;


import java.util.LinkedList;

public class DeleteAlternate {
    static LinkedNode root;
    static LinkedNode trav;
    static int count=0;
	public static void main(String[] args) {
		root=new LinkedNode(1);
		root.next=new LinkedNode(2);
		root.next.next=new LinkedNode(3);
		root.next.next.next=new LinkedNode(4);
		root.next.next.next.next=new LinkedNode(5);
		trav=root;
        while(root.next!=null)
        {
        	root.next=root.next.next;
        	root=root.next;
        }
        while(trav!=null)
        {
        	System.out.println(trav.data);
        	trav=trav.next;
        }
	}

}
