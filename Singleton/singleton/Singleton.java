package singleton;

import java.util.*;

public class Singleton {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Browser obj = Browser.getInstance();
		while(true)
		{
			System.out.println("1.Create instance\n2.Add URL\n3.View history\n4.Exit");
			int choice = sc.nextInt();
			
			if(choice == 1)
				obj = Browser.getInstance();
			else if(choice == 2)
			{
				System.out.println("Enter the url");
				String s = sc.next();
				obj.add(s);
			}
			else if(choice == 3)
				obj.getHistory();
			else if(choice == 4)
				break;
			else
				System.out.println("Invalid choice");
		}
		sc.close();
	}

}