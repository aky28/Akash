package morgan;

public class PongThread extends Thread{
	PingPong p;

	public PongThread(PingPong t) {
		p=t;
	}
	@Override
	public void run() {
		try {
			p.pong();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
