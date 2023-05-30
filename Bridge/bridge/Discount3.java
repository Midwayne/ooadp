package bridge;

import java.util.*;

public class Discount3 implements Discount {

	public double calc(double price)
	{
		System.out.println("25% discount applied");
		return price*0.75;
	}

}