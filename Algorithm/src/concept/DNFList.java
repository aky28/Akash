package concept;

public class DNFList {

	public static void main(String[] args) {
		Node head;
        head=new Node(1);
        head.next=new Node(1);
        head.next.next=new Node(2);
        head.next.next.next=new Node(0);
        head.next.next.next.next=new Node(2);
        head.next.next.next.next.next=new Node(0);
        head.next.next.next.next.next.next=new Node(1);
        System.out.println("hiiii");
        sort(head);
        System.out.println("hello there");
        while(head!=null)
        {
        	System.out.println(head.data+" ");
        	head=head.next;
        }
	}
	
	public static void sort(Node h)
	{
		int one=0,two=0,zero=0;
		Node x=h;
		while(h!=null)
		{
			if(h.data==0)
				zero++;
			else if(h.data==1)
				one++;
			else if(h.data==2)
				two++;
			
			h=h.next;
		}
		while(x!=null)
		{
			if(zero!=0)
			{
				x.data=0;
				zero--;
			}
			else if(one!=0)
			{
				x.data=1;
				one--;
			}
				
			else if(two!=0)
			{
				x.data=2;
				two--;
			}
				
			x=x.next;
		}
		
	}

}
