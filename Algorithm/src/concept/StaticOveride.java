package concept;

public class StaticOveride extends OverrideClass{

	
	  public void m1()  { System.out.println("Overriden methods"); }
	 
	
	
	  public void m() { System.out.println(" m method in subclass"); }
	 
	
	public static void main(String[] args) {
		
         StaticOveride s=new StaticOveride();
         s.m();
         OverrideClass o=new OverrideClass();
         o.m();
	}

}
