package concept;

public class Reference {

	public static void main(String[] args) {
		Dog d=new Dog("Akash");
		Dog b=d;
		d.display();
        test(b);
		d=new Dog("Suraj");
		d.display();
		test(b);
	}
	
	public static void test(Dog b)
	{
		b.display();
	}

}
