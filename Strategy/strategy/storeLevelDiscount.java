package strategy;

import java.util.*;

public class storeLevelDiscount {

	double discount = 100;
	
    double storeDiscount(double price) {
    	if(price > 2000)
			price -= discount;
		return price;
    }

}