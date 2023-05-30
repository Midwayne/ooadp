package bridge;

import java.util.*;

public class FirstTime extends Customer {

    FirstTime(Discount d) {
    	super(d);
	}
    
	double calculate(double price)
	{
		System.out.println("Welcome first time customer");
		return d.calc(price);
	}

}