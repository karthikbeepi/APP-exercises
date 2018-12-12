package builderPattern;

public class GameDemo {

	public static void main(String[] args) {
		
		StakeHolder sh = new StakeHolder(new RockstarGames());
		
		Game g = sh.createGame();
		
		System.out.println(g);
		
		sh = new StakeHolder(new Ubisoft());
		
		g = sh.createGame();
		
		System.out.println(g);
		
	}

}
