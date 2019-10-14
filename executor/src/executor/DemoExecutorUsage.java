package executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {

	private static ExecutorService service=null;
	private static volatile Future taskone=null;
	private static volatile Future tasktwo=null;
	
	public static void main(String[] args) throws InterruptedException {
		service=Executors.newFixedThreadPool(2);
       // while(true)
        //{
        	checkTasks();
        	Thread.sleep(1000);
        //}
	}
	
	public static void checkTasks() throws InterruptedException
	{
		if(taskone==null||taskone.isDone()||taskone.isCancelled())
		{
			taskone=service.submit(new TestOne());
			System.out.println("taskone : "+taskone);
			Thread.sleep(1000);
		}
		if(tasktwo==null||tasktwo.isDone()||tasktwo.isCancelled())
		{
			tasktwo=service.submit(new TestTwo());
			System.out.println("tasktwo : "+tasktwo);
			Thread.sleep(1000);
		}
	}

}
