package observer;

public class MainClass {

	public static void main(String[] args) {

		Store s1=new Store("Store1", 10);
		Customer c1=new Customer(s1, "Modi");
		Customer c2=new Customer(s1,"Gopal");
		
		s1.setDiscount("Holi", 5);
		
		s1.unregister(c2);
		s1.setDiscount("Diwali", 20);
		
		Customer c3=new Customer(s1, "Raga");
		s1.setDiscount("Ugadi", 15);
    
    }}