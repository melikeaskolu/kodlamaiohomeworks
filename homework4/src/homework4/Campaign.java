package homework4;

public class Campaign {
	private int id;
	private String name;
	private double discoundRate;
	public Campaign() {
		super();
	}
	public Campaign(int id, String name, double discoundRate) {
		super();
		this.id = id;
		this.name = name;
		this.discoundRate = discoundRate;
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
	public double getDiscoundRate() {
		return discoundRate;
	}
	public void setDiscoundRate(double discoundRate) {
		this.discoundRate = discoundRate;
	}

}
