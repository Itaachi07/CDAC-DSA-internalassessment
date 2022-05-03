import java.util.Comparator;

public class Vehicle  {
	String company;
	String model;
	String type;
	int price;
	int no;
	String color;
	public Vehicle(String company, String model, String type, int price, int no, String color) {
		super();
		this.company = company;
		this.model = model;
		this.type = type;
		this.price = price;
		this.no = no;
		this.color = color;
	}
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
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
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
		return "Vehicle [company=" + company + ", model=" + model + ", type=" + type + ", price=" + price + ", no=" + no
				+ ", color=" + color + "]";
	}
	/*public int compareTo (Vehicle v)
	{
		return this.getPrice().compareTo(getPrice());
	}
	*/
}
/*	class Price implements Comparator<Vehicle>
	{	@Override
	public int compare(Price p1, Price p2) {
		if(p1.getPrice()==p2.getPrice())
			return 0;
		if(p1.getPrice()>p2.getPrice())
		{return 1;
		}
		return -1;
		}
	}*/
