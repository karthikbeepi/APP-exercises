package builderPattern;

public class StakeHolder {

	GameStudio gs;
	
	public StakeHolder(GameStudio s) {
		this.gs = s;
	}
	
	public Game createGame()
	{
		gs.makeStory();
		gs.makeGraphics();
		return gs.getGame();
	}
	
	
}
