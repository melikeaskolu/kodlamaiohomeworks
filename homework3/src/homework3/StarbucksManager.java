package homework3;

public class StarbucksManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	public StarbucksManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)){
			super.save(customer);
		}else {
			System.out.println("Doðrulama baþarýsýz");
		}
		
		
		
		
	}
	
	
	

}
