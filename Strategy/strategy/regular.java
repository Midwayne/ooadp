package strategy;

import java.util.*;

public class regular extends pricingStrategy {

	double calc(double price)
	{
		return price*0.12;
	}
	

}