package factory;

public class GetPlanFactory {

	public Plan getPlan(String name)
	{
		if(name.equalsIgnoreCase(null))
			return null;
		if(name.equalsIgnoreCase("commercialPlan"))
		{
			return new CommercialPlan();
		}
		else if(name.equalsIgnoreCase("DomesticPlan"))
		{
			return new DomesticPlan();
		}
		else
			return new InstitutionalPlan();
	}
}
