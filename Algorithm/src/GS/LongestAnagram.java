package GS;

import java.util.ArrayList;
import java.util.List;

public class LongestAnagram {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		
		ArrayList<String> list1=new ArrayList<String>();

        list.add("ad");
        list.add("DAddske");
        list.add ("gdslels");
        list.add ("Daund");
        list.add ("edlsjf");
        list.add ("UDAadunnnD");
        String input="Daund";
        String input1="eot";

        LongestAnagram l=new LongestAnagram();
        System.out.println(l.anagram(list, input));
        
        list1.add ("to");
        list1.add ("toe");
        list1.add ("cat");
        list1.add ("cate");
        list1.add ("house");

        System.out.println(l.anagram(list1, input1));

	}
	
	public String anagram(List<String> List,String input)
	{
		boolean flag=true;
		int i=0;
		ArrayList<String> ana=new ArrayList<String>();
		char inp[]=input.toCharArray();
		for(String x:List)
		{
			for(i=0;i<input.length();i++)
			{
				if(!x.contains(String.valueOf(inp[i])))
				{
					flag=false;
					break;
				}
			}
			/*if(flag&&((x.length()-1)==(i-1)))
			{
				ana.add(x);
			}*/
			if(flag&&(x.length()==inp.length))
				ana.add(x);
			
			flag=true;
		}
		
		input=checkLength(ana);
		return input;
	}
	
	public String checkLength(List<String> ana)
	{
		int len=0;
		String x=null;
		for(String s:ana)
		{
			if(s.length()>len)
			{
				x=s;
				len=s.length();
			}
		}
		
		return x;
	}

}
