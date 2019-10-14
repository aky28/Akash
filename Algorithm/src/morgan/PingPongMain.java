package morgan;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PingPongMain {

	public static void main(String[] args) {
		PingPong p=new PingPong();
		pingThread p1=new pingThread(p);
		PongThread p2=new PongThread(p);
		ExecutorService s=Executors.newFixedThreadPool(2);
        s.submit(p1);
        s.submit(p2);
	}

}
