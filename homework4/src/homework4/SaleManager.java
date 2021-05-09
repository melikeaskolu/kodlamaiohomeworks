package homework4;

public class SaleManager implements SaleService{

	@Override
	public void add(Game game, Gamer gamer) {
		System.out.println(game.getName()+ " Oyunu " +game.getPrice()+" TL' den "+gamer.getFirstName() + " "+ gamer.getLastName()+" Oyuncusuna satýldý.");
		
	}

	@Override
	public void add1(Game game, Gamer gamer, Campaign campaign) {		
		System.out.println(game.getName()+ " Oyunu " +game.getPriceAfterDiscount()+" TL' den "+gamer.getFirstName() + " "+ gamer.getLastName()+" Oyuncusuna"+" "+campaign.getName()+" ile satýldý.");

		
	}
	

}
