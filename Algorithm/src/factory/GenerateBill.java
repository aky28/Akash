package factory;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GetPlanFactory gp=new GetPlanFactory();
		System.out.println("Enter the name of the plan for which bill should be generated");
		String name=sc.next();
		Plan p=gp.getPlan(name);
		//p.getRate();
		p.calculateBill(100);
	}

}
