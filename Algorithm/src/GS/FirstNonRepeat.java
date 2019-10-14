package GS;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FirstNonRepeat {

	public static void main(String[] args) {
	    boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s=sc.nextLine();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		char a[]=s.toCharArray();
		for(char p:a)
		{
			if(map.containsKey(p))
			{
				int val=map.get(p);
				val++;
				map.put(p,val);
			}
			else
			{
				map.put(p,1);
			}
		}
		for(Entry<Character, Integer> c:map.entrySet())
		{
			if(c.getValue()==1)
			{
				System.out.println(c.getKey());
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("every charachter is repeatating");
		}
	}

}
