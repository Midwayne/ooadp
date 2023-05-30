package bridge;

import java.util.*;

public class Discount1 implements Discount {

	public double calc(double price)
	{
		System.out.println("15% discount applied");
		return price*0.85;
	}

}