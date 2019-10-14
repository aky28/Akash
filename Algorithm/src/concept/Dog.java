package concept;

public class Dog extends Cat {

	String x;
	Dog(String name)
	{
		x=name;
		System.out.println("Dog constructor");
	}
	public void display()
	{
		System.out.println(x);
	}
}
