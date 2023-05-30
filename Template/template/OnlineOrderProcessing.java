package template;

import java.util.*;

public class OnlineOrderProcessing extends OrderProcessing {

	int totalAmt = 0;
	int item;
	Scanner sc = new Scanner(System.in);

    void selectItem() {
    	System.out.println("welcome to online store");
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
    	System.out.println("Pay bill through:\n1.cash\n2.swipe-card");
    }

    void doDelivery() {
    	System.out.println("total bill amount " + totalAmt);
		System.out.println("You can collect your item at counter 1\nThank you for shopping with us");
    }

}