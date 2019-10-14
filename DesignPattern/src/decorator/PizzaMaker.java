package decorator;

public class PizzaMaker {

	public static void main(String args[])
	{
		Pizza pizzamaker=new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println(pizzamaker.getDescription());
		System.out.println(pizzamaker.getCost());
	}
}
