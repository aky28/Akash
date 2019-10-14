package decorator;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza tempPizza) {
		super(tempPizza);
		System.out.println("Adding dough");
		System.out.println("Adding Moz");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription()+" ,Mozzarila";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost()+ 0.50;
	}


}
