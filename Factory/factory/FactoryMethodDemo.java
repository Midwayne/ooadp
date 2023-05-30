package factory;

import java.util.*;

/**
 * 
 */
public class FactoryMethodDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome");
		
		CustomerFactory cf = new CustomerFactory();
		Customer c1 = cf.getCustomer("regular");
		Customer c2 = cf.getCustomer("senior");
		Customer c3 = cf.getCustomer("first time");
		
		c1.getType();
		c2.getType();
		c3.getType();
		
	}
}