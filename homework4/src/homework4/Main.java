package homework4;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Melike");
		gamer.setLastName("Aþýkoðlu");
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println("----------------------------------");
		
		Game game = new Game();
		game.setId(1);
        game.setName("CSGO");
        game.setPrice(500);
        game.getPriceAfterDiscount();
        
        GameManager gameManager= new GameManager();
        gameManager.add(game);
        gameManager.update(game);
        gameManager.delete(game);
        
        System.out.println("----------------------------------");
        
        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setName("Yeni kayýt indirimi");
        campaign.setDiscoundRate(50);

        CampaignManager campaignManager= new CampaignManager();
        campaignManager.add(campaign);
        campaignManager.update(campaign);
        campaignManager.delete(campaign);
        
        System.out.println("----------------------------------");
        
        Sale sale= new Sale();
        sale.setId(1);
        sale.setName("oyun satýþý");
        
        SaleManager saleManager=new SaleManager();
        saleManager.add(game, gamer);
        
        System.out.println("----------------------------------");
        
        Sale sale1= new Sale();
        sale1.setId(1);
        sale1.setName("oyun satýþý");
        
        SaleManager saleManager1=new SaleManager();
        saleManager1.add1(game, gamer, campaign);;
        
        
        
        
        
        
        }
	

}
