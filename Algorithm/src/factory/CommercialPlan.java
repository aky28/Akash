package factory;

public class CommercialPlan extends Plan {

	public CommercialPlan() {
		rate=7.50;
	}
	@Override
	void getRate() {
		rate=7.50;
	}

}
