package executor;

public class TestTwo implements Runnable {

	@Override
	public void run() {
		while(true)
		{
			System.out.println("Executing the task Second");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
