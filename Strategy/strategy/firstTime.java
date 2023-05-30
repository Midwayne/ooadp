package strategy;

import java.util.*;

public class firstTime extends pricingStrategy {

	double calc(double price)
	{
		return price*0.15;
	}
}