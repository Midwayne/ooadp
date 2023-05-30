package singleton;

import java.util.*;

/**
 * 
 */
public class Browser {

	private static Browser instance; 
	private ArrayList<String> history = new ArrayList<>();
	private Browser()
	{		
	}
	public static Browser getInstance() 
	{
		if(instance == null)
			instance = new Browser();
		else
			System.out.println("Instance already created");
		return instance;
	}
	
	public void add(String url)
	{
		history.add(url);
	}
	
	public void getHistory()
	{
		for(String str : history)
			System.out.println(str);
	}
}