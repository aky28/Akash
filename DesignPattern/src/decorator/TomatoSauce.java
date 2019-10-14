package decorator;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza tempPizza) {
		super(tempPizza);
		System.out.println("Adding sauce");
	}

	@Override
	public String getDescription() {
		return tempPizza.getDescription()+" ,Tomato Sauce";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return tempPizza.getCost()+ .35;
	}

}
