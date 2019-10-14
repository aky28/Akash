package concept;

public class Overload {

	public static void main(String[] args) {
       Overload o=new Overload();
       o.meth1();
       o.meth1(2);
	}
	
	public static void meth1() {
		System.out.println("static methd without parameter");
	}
	public static void meth1(int a) {
		System.out.println("static methd with parameter : "+a);
	}

}
