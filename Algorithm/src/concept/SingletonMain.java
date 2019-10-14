package concept;

public class SingletonMain {

	public static void main(String[] args) {
       Singleton s=Singleton.getInstance();
       Singleton s2=Singleton.getInstance();
       
       System.out.println(s==s2);
	}

}
