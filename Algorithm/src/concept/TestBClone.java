package concept;

public class TestBClone implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	String name;
	TestAClone ta;
	public TestBClone(String x,int a,int b) {
		name=x;
		ta=new TestAClone();
		ta.x=a;
		ta.y=b;
	}
	
	public void display()
	{
		System.out.println(name+" "+ta.x+" "+ta.y);
	}
}
