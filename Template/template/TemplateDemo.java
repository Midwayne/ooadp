package template;

import java.util.*;

public class TemplateDemo {

	public static void main(String[] args) {
			
		OrderProcessing online = new OnlineOrderProcessing();
		online.processOrder();
		OrderProcessing offline = new OfflineOrderProcessing();
		offline.processOrder();
	}

}