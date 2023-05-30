package strategy;

import java.util.*;

public class context {
    
    pricingStrategy s;
	storeLevelDiscount sd = new storeLevelDiscount();
	
	context(pricingStrategy s)
	{
		this.s = s;
	}	
	
	void calculate(double price)
	{
		double amt = sd.storeDiscount(price);
		double customerdis = s.calc(amt);
		double total = amt - customerdis;
		System.out.println("amount to be paid after discount is " + total);
	}
}