package concept;

public class Cat {
    String x;
    Cat()
    {
    	this("Cat Constructor");
    	System.out.println("Cat no argument constructor");
    	
    }
	Cat(String name)
	{
		x=name;
		System.out.println(x);
	}
	public void display()
	{
		System.out.println(x);
	}

}
