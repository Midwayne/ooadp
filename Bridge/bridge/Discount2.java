package bridge;

import java.util.*;

public class Discount2 implements Discount {

	public double calc(double price)
	{
		System.out.println("20% discount applied");
		return price*0.80;
	}

}