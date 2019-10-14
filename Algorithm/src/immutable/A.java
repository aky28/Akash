package immutable;

final public class A {

	private final int a;
	private final int b;
	private final B b1;
	
	public A(int a, int b,B b2) {
		super();
		this.a = a;
		this.b = b;
		b1=new B();
		b1.fathername=b2.fathername;
		b1.name=b2.name;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public B getB1() {
		return b1;
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.fathername="Deepak kumar sinha";
		b.name="Akash";
		
		B b1=new B();
		b1.fathername="Mohan Singh";
		b1.name="Rohit Singh";
		
		A a1=new A(20,50,b);
		A a2=new A(30,40,b1);
		
		System.out.println(a1.getA()+" "+ a1.getB()+" "+a1.getB1().fathername+" "+a1.getB1().name);
		System.out.println(a2.getA()+" "+ a2.getB()+" "+a2.getB1().fathername+" "+a2.getB1().name);
		
		b1.fathername="Narayan Sonthalia";
		b1.name="Prerna Sonthalia";
		
		b.fathername="Ramesh Singh";
		b.name="Samip";
		
		System.out.println(a1.getA()+" "+ a1.getB()+" "+a1.getB1().fathername+" "+a1.getB1().name);
		System.out.println(a2.getA()+" "+ a2.getB()+" "+a2.getB1().fathername+" "+a2.getB1().name);
		

	}

	

}
