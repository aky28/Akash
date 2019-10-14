package concept;

public class CloneMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		TestBClone b= new TestBClone("Akash",100,100);
		b.display();
        TestBClone c= (TestBClone) b.clone();
        c.display();
        System.out.println(b==c);
        c.ta.x=200;
        System.out.println(b.ta==c.ta);
        b.display();
        c.display();
        
        System.out.println(b.name==c.name);
	}

}
