package homework4;

public class GamerManager implements GamerService {
	//oyuncu iþlemleri

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" Oyuncu eklendi");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" Oyuncu güncellendi");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" "+gamer.getLastName()+" Oyuncu silindi");
	}
	

}
