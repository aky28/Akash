package callableMethods;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable runnable= () ->{
			try {
				Thread.sleep(1000);
				System.out.println("CurrentTime : "+LocalDateTime.now());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		ExecutorService es=Executors.newFixedThreadPool(10);
		es.execute(runnable);
        
		Future<String> result=es.submit(runnable,"Done");
		
		while(result.isDone()==false)
		{
			try
			{
				System.out.println("The method return value : "+result.get());
				break;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			Thread.sleep(1000);
		}
		
		es.shutdown();
	}

}
