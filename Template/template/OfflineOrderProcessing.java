package template;

import java.util.*;

public class OfflineOrderProcessing extends OrderProcessing {

	int totalAmt = 0;
	int item;
	Scanner sc = new Scanner(System.in);

    void selectItem() {
    	System.out.println("Welcome to offline store");
		System.out.println("1 | 400Rs");
		System.out.println("2 | 600Rs");
		System.out.println("3 | 200Rs");
		System.out.println("4 | 300Rs");
		
		System.out.println("Choose number of items you want to buy: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("Choose item: ");
			item=sc.nextInt();
			if(item==1) totalAmt+=400;
			if(item==2) totalAmt+=600;
			if(item==3) totalAmt+=200;
			if(item==4) totalAmt+=300;
		}
    }

    void doPayment() {
    	System.out.println("Pay via Net Banking");
    }

    void doDelivery() {
    	String s = "India";
		int shippingcharge = 100;
		System.out.println("Shipping charges for address " + s + " is "+ shippingcharge);
		System.out.println("Total bill amount " + (totalAmt + shippingcharge));
		System.out.println("Thank you for shopping with us");
    }

}