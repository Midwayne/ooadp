package bridge;

import java.util.*;

public class BridgeDemo {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Customer c1 = new Regular(new Discount1());
		System.out.println("total amount to be paid " + c1.calculate(100));
		
		Customer c2 = new Regular(new Discount2());
		System.out.println("total amount to be paid " + c2.calculate(100));
		
		Customer c3 = new FirstTime(new Discount1());
		System.out.println("total amount to be paid " + c3.calculate(100));
		
		/*
		System.out.println("1: Regular\n2: Senior Citizen\n3: First Time");
		System.out.println("Enter type of customer: ");
		int cust = sc.nextInt();
		
		System.out.println("1: Discount 1\n2: Discount 2\n3: Discount 3\n4: Discount 4");
		System.out.println("Enter the type of discount: ");
		int disc = sc.nextInt();
		*/
	}
}