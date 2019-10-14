package carDecoratorPattern;

public class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car car) {
		super(car);
		System.out.println("Adding the feature of luxuy car");
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding the feature of luxuy car");
	}
	
	

}
