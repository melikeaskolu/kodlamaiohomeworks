package homework3;

public class Customer implements Entity {
    private String nationalIdentity;
	private String firstName;
	private String lastName;
	private int dateOfBird;

	public Customer(String nationalIdentity, String firstName, String lastName, int dateOfBird) {
		super();
		this.nationalIdentity = nationalIdentity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBird = dateOfBird;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
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

	public int getDateOfBird() {
		return dateOfBird;
	}

	public void setDateOfBird(int dateOfBird) {
		this.dateOfBird = dateOfBird;
	}

	
}
