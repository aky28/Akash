package carDecoratorPattern;

public class BasicCar implements Car {

	public BasicCar() {
		System.out.println("This is the basic version of car");
	}
	@Override
	public void assemble() {
		System.out.println("This is the basic version of car");
	}

}
