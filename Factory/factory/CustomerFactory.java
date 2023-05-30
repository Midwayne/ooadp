package factory;

import java.util.*;

public class CustomerFactory {

	Customer getCustomer(String type)
	{
		if(type.equalsIgnoreCase("regular"))
			return new Regular();
		else if(type.equalsIgnoreCase("senior"))
			return new SeniorCitizen();
		else //first
			return new FirstTime();		
	}

}