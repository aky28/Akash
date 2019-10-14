package morgan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Mapping {

	public static void main(String[] args) {
		int a[]=new int[] {1, 5, 2, 4, 4, 3};
		int b[]=new int[] {1, 2, 5, 1};
		List a1=Arrays.asList(a);
		List b1=Arrays.asList(b);
		
		
		ArrayList<String> al=new ArrayList<String>();
        for(int i=0;i<b.length;i++)
        {
        	int flag=0;
        	for(int j=0;j<a.length;j++)
        	{
        		 if(b1.get(i)==a1.get(j))
        		{
        		    flag=j;	
        		    a1.remove(j);
        		}
        	}
        	if(flag!=0)
        	{
        		al.add(String.valueOf(flag));
    		}
        	else
        	{
        		al.add("NA");
        	}
        }
        
        for(String x:al)
        	System.out.println(x+" ");
	}

}
