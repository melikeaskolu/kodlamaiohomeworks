package homework4;

public class GameManager implements GameService {
	//oyun iþlemleri
	@Override
	public void add(Game game) {
		System.out.println(game.getName()+" Oyunu baþarýyla eklendi");
	}
	@Override
	public void update(Game game) {
		System.out.println(game.getName()+" Oyunu baþarýyla güncellendii");
	}
	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+" Oyunu baþarýyla silindi");
	}
	
	
	

}
