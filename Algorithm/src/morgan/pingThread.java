package morgan;

public class pingThread extends Thread{

	PingPong p;

	public pingThread(PingPong t) {
		p=t;
	}
	@Override
	public void run() {
		try {
			p.ping();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
