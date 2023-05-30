package bridge;

import java.util.*;

public class SeniorCitizen extends Customer {

    public SeniorCitizen(Discount d) {
		super(d);
	}
    
	double calculate(double price) {
		System.out.println("Welcome senior citizen customer");
		return d.calc(price);
	}

}