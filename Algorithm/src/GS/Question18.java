package GS;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question18 {

	public static void main(String[] args) {
		String file[]= { "Shrikanth", "20", "30",  
                "10", "Ram", "100", "50", "10" };
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		int max=0;
		String name=null;
		for(int i=0;i<file.length;i=i+4)
		{
			int marks1=Integer.parseInt(file[i+1]);
			int marks2=Integer.parseInt(file[i+2]);
			int marks3=Integer.parseInt(file[i+3]);
			int avrg=(marks1+marks3+marks2)/3;
			map.put(file[i],avrg);
		}
		
		for(Entry<String,Integer> m:map.entrySet())
		{
			System.out.println("Name:"+m.getKey()+" Average "+m.getValue());
			if(m.getValue()>max)
			{
				name=m.getKey();
				max=m.getValue();
			}
		}
		
		System.out.println("Highest avergae is "+max+" by Student "+name);

	}

}
