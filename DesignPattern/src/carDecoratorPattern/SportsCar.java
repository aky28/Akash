package carDecoratorPattern;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
		System.out.println("Add the sports car functionality");
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Add the sports car functionality");
	}
	
	

}
