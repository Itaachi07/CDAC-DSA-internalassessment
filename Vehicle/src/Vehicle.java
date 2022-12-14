import java.util.Comparator;
import java.util.Scanner;

public class Vehicle  
{
	String company;
	String model;
	String type;
	int price;
	String no;
	String color;
	public Vehicle() //parameterless constructor
	{
		
	}
	//parameterized constructor
	public Vehicle(String company, String model, String type, int price, String no, String color) {
		super();
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.no = no;
		this.color = color;
	} 		// getters & setters
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Vehicle : Company=" + company + ", Model=" + model + ", Type=" + type + ", Price=" + price + ", No=" + no
				+ ", Color=" + color ;
	}
	 
	public void acceptDetails() // to accept details from user
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Car Company");
		this.setCompany(sc.next());
		
		System.out.println("Enter Car Model");
		this.setModel(sc.next());
		
		System.out.println("Enter Car Type");
		this.setType(sc.next());
		
		System.out.println("Enter Car Price");
		this.setPrice(sc.nextInt());
		
		System.out.println("Enter Car No");
		this.setNo(sc.next());
		
		System.out.println("Enter Car Color");
		this.setColor(sc.next());
	
		
	}
}

