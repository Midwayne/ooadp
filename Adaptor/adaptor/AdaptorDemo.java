package adaptor;

import java.util.*;

public class AdaptorDemo {

    public static void main(String[] args) {
		
		decathlonTaxCalc tc = new mauriTaxAdaptor();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the bill amount: ");
		double bill = sc.nextDouble();
		
		double taxAmt = tc.taxCalc(bill);
		System.out.println("Tax " + taxAmt + " to be paid on bill price of " + bill);
		System.out.println("Total amount: "+(bill+taxAmt));
	}

}