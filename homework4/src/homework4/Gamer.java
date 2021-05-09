package homework4;

public class Gamer { 
	//oyuncu özellikleri
	private int id;
	private String firstName;
	private String lastName;
	private double birthday;
	public Gamer() {
		super();
	}
	public Gamer(int id, String firstName, String lastName, Double birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getBirthday() {
		return birthday;
	}
	public void setBirthday(Double birthday) {
		this.birthday = birthday;
	}
	
	

}
