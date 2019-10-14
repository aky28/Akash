package GS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxIpOcc {
	
	
	public static void main(String[] args) {
	   int max=0;
	   String v=null;
	   ArrayList<String> ip=new ArrayList<String>();
       HashMap<String,Integer> map=new HashMap<String,Integer>();
       Scanner sc=new Scanner(System.in);
       boolean flag=true;
		/*
		 * while(flag) { System.out.println("Enter the IP Address"); String
		 * add=sc.nextLine(); ip.add(add);
		 * System.out.println("Do you still want to add the address type YES or NO");
		 * String h=sc.next(); if(h=="YES") flag=true; else flag=false; }
		 */
        ip.add("255.255.11.135");
        ip.add("255.255.111.35");
        ip.add("255.255.111.135");
        ip.add("255.255.11.135");
        ip.add("255.255.98.135");


		for(String s:ip)
		{
			if(map.containsKey(s))
			{
				int val=map.get(s);
				val++;
				map.put(s,val);
			}
			else
				map.put(s, 1);
		}
		
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			if(m.getValue()>=max)
			{
				max=m.getValue();
				v=m.getKey();
			}
		}
		
		System.out.println(v);
		
	}

}
