package homework4;

public class Game {
	//oyun özellikleri
	private int id;
	private String name;
	private double price;
	private double priceAfterDiscount;
	
	public Game() {
		super();
	}
	public Game(int id, String name, double price,double priceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.priceAfterDiscount= priceAfterDiscount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPriceAfterDiscount() {
		return this.priceAfterDiscount-(this.priceAfterDiscount*this.price /100);
	}
	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}


}
