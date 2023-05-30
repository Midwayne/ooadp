package template;

import java.util.*;

public abstract class OrderProcessing {

	public void processOrder()
	{
		selectItem();
		doPayment();
		doDelivery();
	}
	abstract void selectItem();
	abstract void doPayment();
	abstract void doDelivery();

}