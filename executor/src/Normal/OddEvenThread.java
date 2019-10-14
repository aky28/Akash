package Normal;

public class OddEvenThread {

	int count=0;
	public void even() throws InterruptedException
	{
		synchronized (this) {
			while(true)
			{
				if(count%2!=0)
					wait();
				System.out.println("Even Thread : "+count);
				count++;
				notify();
			}
		}
	}
	public void odd() throws InterruptedException
	{
		synchronized (this) {
			while(true)
			{
				if(count%2==0)
					wait();
				System.out.println("Odd Thread : "+count);
				count++;
				notify();
			}
		}
	}
}
