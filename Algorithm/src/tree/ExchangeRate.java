package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ExchangeRate {

	public static int getminimum(ArrayList<Integer> unVisited,float []weight)
	{
		float min=Integer.MAX_VALUE;
		int position=0;
		for(int x:unVisited)
		{
			if(weight[x]<min)
			{
				min=weight[x];
				position=x;
			}
		}
		return position;
	}
	
	public static float myFuction(float adMatrix[][],HashMap<String,Integer> map,String source,String destination,float amount)
	{
		ArrayList<Integer> unVisited=new ArrayList<Integer>();
		for(Entry<String, Integer> m:map.entrySet())
		   unVisited.add(m.getValue());
	    float weight[]=new float[map.size()];
	    for(int i=0;i<weight.length;i++)
	       weight[i]=Integer.MAX_VALUE;
	    weight[map.get(source)]=1;
		while(!unVisited.isEmpty())
		{
			int minimum=getminimum(unVisited,weight);
			for(int i=0;i<adMatrix.length;i++)
			{
				if(adMatrix[minimum][i]!=0 && adMatrix[minimum][i]*weight[minimum]<weight[i] && unVisited.contains(i))
				{
					weight[i]=weight[minimum]*adMatrix[minimum][i];
				}
				//System.out.println(weight[i]+" ");
			}
			int index=unVisited.indexOf(minimum);
			unVisited.remove(index);
		}
		
		for(int i=0;i<weight.length;i++)
			System.out.print(weight[i]+" ");
		
		System.out.println();
		return weight[map.get(destination)]*amount;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nodes="EUR,USD,GBP,AUD,JPY,INR";
		String [] newlength=nodes.split(",");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		for(int i=0;i<newlength.length;i++)
		{
			map.put(newlength[i],i);
		}
		
		float admatrix[][]=new float[nodes.length()][nodes.length()];
		ArrayList<String> graph=new ArrayList<String>();
		graph.add("EUR/USD=1.2");
		graph.add("USD/GBP=0.75");
		graph.add("GBP/AUD=1.7");
		graph.add("AUD/JPY=90");
		graph.add("GBP/JPY=150");
		graph.add("JPY/INR=0.6");
		for(int i=0;i<graph.size();i++)
		{
			String pattern[]=graph.get(i).split("=");
			String country[]=pattern[0].split("/");
			admatrix[map.get(country[0])][map.get(country[1])]=Float.parseFloat(pattern[1]);
			admatrix[map.get(country[1])][map.get(country[0])]=1/(Float.parseFloat(pattern[1]));
		}
		
		System.out.println(myFuction(admatrix, map,"EUR", "INR",100));
	}
	

}
