package callableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executor =Executors.newFixedThreadPool(4);
		List<Future<Integer>> resultList=new ArrayList<>();
        Random random=new Random();
        
        for(int i=0;i<4;i++)
        {
        	Integer n=random.nextInt(10);
        	FactorialCalculator calculator=new FactorialCalculator(n);
        	Future<Integer> result=executor.submit(calculator);
        	resultList.add(result);
        }
        
        for(Future<Integer> future:resultList)
        {
        	System.out.println("FutureResult is : "+future.get()+" And task is done : "+future.isDone());
        }
        
        executor.shutdown();
	}

}
