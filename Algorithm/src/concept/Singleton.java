package concept;

public class Singleton {

	private static Singleton singleton=null;
	
	private Singleton()
	{
		System.out.println("Not possible from outside world ");
	}
	public static Singleton getInstance()
	{
		if(singleton==null)
			singleton=new Singleton();
		return singleton;
	}
	
	public static void main(String args[])
	{
		//Singleton s=new Singleton();
		Singleton s1=Singleton.getInstance();
		
		//System.out.println(s==s1);
	}
}
