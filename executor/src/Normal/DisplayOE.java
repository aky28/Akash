package Normal;

public class DisplayOE implements Runnable{

	OddEvenThread oe=null;
	
	DisplayOE(OddEvenThread oe)
	{
		this.oe=oe;
	}
	@Override
	public void run() {
		try {
			oe.even();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
