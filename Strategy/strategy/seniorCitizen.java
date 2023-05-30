package strategy;

import java.util.*;

public class seniorCitizen extends pricingStrategy {

	double calc(double price) {
		return price*0.10;
	}
	
}