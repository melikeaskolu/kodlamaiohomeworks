package homework3;

public class Main {

	public static void main(String[] args) {
	
		BaseCustomerManager baseCustomerManager=new StarbucksManager( new MernisServiceAdapter());
		
		baseCustomerManager.save(new Customer("14921067370","Melike","Aþýkoðlu",2001 ));
	}

}
