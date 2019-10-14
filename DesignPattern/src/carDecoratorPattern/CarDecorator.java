package carDecoratorPattern;

public class CarDecorator implements Car{

	protected Car car;
	
	public CarDecorator(Car car) {
		super();
		this.car=car;
	}
	
	@Override
	public void assemble() {
		System.out.println("Decorator class assemble");
	}

}
