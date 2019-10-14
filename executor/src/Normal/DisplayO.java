package Normal;

public class DisplayO implements Runnable{

	OddEvenThread oe=null;
	
	DisplayO(OddEvenThread oe)
	{
		this.oe=oe;
	}
	
	@Override
	public void run() {
		try {
			oe.odd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
