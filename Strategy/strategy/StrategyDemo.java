package strategy;

import java.util.*;

public class StrategyDemo {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("1: Regular customer\n2: Senior Citizen\n3: First time");
		System.out.println("Enter the type of customer discount: ");
		int ch = sca.nextInt();
		System.out.println("Enter bill amount: ");
		double bill = sca.nextDouble();
		
		switch(ch) {
		case 1:
			pricingStrategy rc = new regular();
			context c1 = new context(rc);
			c1.calculate(bill);
			break;
		case 2:
			pricingStrategy sc = new seniorCitizen();
			context c2 = new context(sc);
			c2.calculate(bill);
		}
		

	}

}