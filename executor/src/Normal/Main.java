package Normal;

public class Main {

	public static void main(String[] args) {
		OddEvenThread oe=new OddEvenThread();
		DisplayO o=new DisplayO(oe);
		DisplayOE e=new DisplayOE(oe);
        Thread t=new Thread(o);
        Thread t1=new Thread(e);
        t.start();
        t1.start();
	}

}
