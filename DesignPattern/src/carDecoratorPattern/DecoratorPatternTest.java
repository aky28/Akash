package carDecoratorPattern;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar=new SportsCar(new LuxuryCar(new BasicCar()));
		//sportsCar.assemble();
		System.out.println();
		Car LuxuryCar=new LuxuryCar(new BasicCar());
	}

}
