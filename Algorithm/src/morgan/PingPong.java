package morgan;

public class PingPong {

	int count=0;
	public void ping() throws InterruptedException
	{
		while(true)
		{
			synchronized (this) {
				if(count!=0)
					wait();
				System.out.println("ping");
				count=1;
				notify();	
			}
		}
	}
	public void pong() throws InterruptedException
	{
		while(true)
		{
			synchronized (this) {
				if(count!=1)
					wait();
				System.out.println("pong");
				count=0;
				notify();	
			}
		}
	}
}
