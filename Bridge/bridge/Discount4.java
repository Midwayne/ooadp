package bridge;

import java.util.*;


public class Discount4 implements Discount {

	public double calc(double price)
	{
		System.out.println("30% discount");
		return price*0.70;
	}

}