package callableFuture;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Integer>{

	Integer number;
	Integer fact=1;
	
	FactorialCalculator(Integer x)
	{
		number=x;
	}
	@Override
	public synchronized Integer call() throws Exception {
		if(number==0||number==1)
			return 1;
		else
		{
			for(int i=1;i<=number;i++)
			{
				fact=fact*i;
			}
			System.out.print("Result for a number : "+ number+" ");
			return fact;
		}
	}

}
