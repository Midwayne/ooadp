package bridge;
import java.util.*;

abstract class Customer {
	
	Discount d;
	Customer(Discount d)
	{
		this.d = d;
	}
	abstract double calculate(double price);

}