package morgan;

import java.util.ArrayList;

public class StockSellBuy {

	public static void main(String[] args) {
		int stock[]=new int[]{ 100, 180, 260, 310, 40, 535, 695 };
        int length=stock.length;
        StockSellBuy s=new StockSellBuy();
        s.cal(stock, length);
	}
	
	public void cal(int stk[],int n)
	{
		int i=0,count=0,k=0;
		ArrayList<Interval> s=new ArrayList<Interval>();
		Interval [] obj=new Interval[n/2];
		while(i<n-1)
		{
			obj[k]=new Interval();
			while((i<n-1)&& stk[i]>stk[i+1])
				i++;
			obj[k].i=i;
			
			i++;
			while((i<n-1) && stk[i+1]>=stk[i])
				i++;
			
			obj[k++].j=i;
			i++;
			
		}
		
		for(int p=0;p<k;p++)
		{
			System.out.println("Buy at day "+obj[p].i+" sell at day "+obj[p].j);
		}
	}

}
