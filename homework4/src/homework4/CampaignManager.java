package homework4;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " sisteme eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " sisteme güncellendi");		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " sisteme silindi");		
	}
	
	

}
