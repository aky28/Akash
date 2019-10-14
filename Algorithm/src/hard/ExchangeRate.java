package hard;

import java.util.ArrayList;
import java.util.HashMap;

public class ExchangeRate {

	public static int getMinimum(ArrayList<Integer> unvisisted,float weight[])
	{
		float min=Float.MAX_VALUE;
		int position=0;
		for(int i=0;i<weight.length;i++)
		{
			if(unvisisted.contains(i))
			{
				if(min>weight[i])
				{
					position=i;
					min=weight[i];
				}
			}
		}
		return position;
	}
	public static float exchange(float adCountry[][],HashMap<String,Integer> map,String source,String destination,int amount)
	{
		float weight[]=new float[map.size()];
		ArrayList<Integer> unvisisted=new ArrayList<Integer>();
		int min=0;
		
		for(int i=0;i<map.size();i++)
			unvisisted.add(i);
		
		for(int i=0;i<weight.length;i++)
			weight[i]=Float.MAX_VALUE;
		
		weight[map.get(source)]=1;
		for(int i=0;i<adCountry.length;i++)
		{
			min=getMinimum(unvisisted, weight);
			for(int j=0;j<adCountry.length;j++)
			{
				if(adCountry[min][j]!=0 && unvisisted.contains(j) && weight[min]*adCountry[min][j]<weight[j])
				{
					weight[j]=weight[min]*adCountry[min][j];
				}
			}
			int index=unvisisted.indexOf(min);
			unvisisted.remove(index);
		}

        for(int i=0;i<weight.length;i++)
        	System.out.print(weight[i]+" ");
        
        System.out.println();
        
        return amount*weight[map.get(destination)];
	}
	public static void main(String[] args) {
		String nodes ="EUR,USD,GBP,AUD,JPY,INR";
        String country[]=nodes.split(",");
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<country.length;i++)
        	map.put(country[i],i);
        float adCountry[][]=new float[map.size()][map.size()];
        ArrayList<String> rate=new ArrayList<String>();
        rate.add("EUR/USD=1.2");
        rate.add("GBP/AUD=1.7");
        rate.add("USD/GBP=0.75");
        rate.add("AUD/JPY=90");
        rate.add("GBP/JPY=150");
        rate.add("JPY/INR=0.6");
        for(int i=0;i<rate.size();i++)
        {
        	String x[]=rate.get(i).split("=");
        	String y[]=x[0].split("/");
        	adCountry[map.get(y[0])][map.get(y[1])]=Float.parseFloat(x[1]);
        	adCountry[map.get(y[1])][map.get(y[0])]=1/Float.parseFloat(x[1]);
        }
        
		/*
		 * for(int i=0;i<adCountry.length;i++) { for(int j=0;j<adCountry.length;j++) {
		 * System.out.print(adCountry[i][j]+" "); } System.out.println(); }
		 */
        
        System.out.println(exchange(adCountry, map,"INR","EUR",1000000));
	}

}
