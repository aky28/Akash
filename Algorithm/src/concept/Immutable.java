package concept;

final public class Immutable {
    final private int a;
    final private int b;
    final private Dog d;
    Immutable(int a,int b,Dog c)
    {
    	this.a=a;
    	this.b=b;
    	d=c;
    	
    }
    
    
	public int getA() {
		return a;
	}


	public int getB() {
		return b;
	}

	

	public static void main(String[] args) {
		 Dog d1=new Dog("Akash");
		 Dog d2=new Dog("Rohit");
         Immutable i1=new Immutable(10,20,d1);
         Immutable i2=new Immutable(30,40,d2);
         System.out.println("a "+i1.getA()+" b"+i1.getB()+" Dog name ");
         i1.getD().display();
         System.out.println("a "+i1.getA()+" b"+i1.getB());
         i2.getD().display();
         d1=new Dog("prerna");
         System.out.println("a "+i1.getA()+" b"+i1.getB()+" Dog name "+d1.hashCode()+" "+i1.getD().hashCode());
         i1.getD().display();
	}


	public Dog getD() {
		return d;
	}

}
