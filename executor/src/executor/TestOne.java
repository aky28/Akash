package executor;

public class TestOne implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			System.out.println("Executing the task one");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
