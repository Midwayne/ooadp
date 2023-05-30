package bridge;

import java.util.*;

public class Regular extends Customer {

    public Regular(Discount d) {
    	super(d);
	}
    
	double calculate(double price)
	{
		System.out.println("Welcome regular customer");
		return d.calc(price);
	}

}