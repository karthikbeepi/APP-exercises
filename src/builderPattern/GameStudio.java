package builderPattern;

public abstract class GameStudio {

	Game g = new Game();
	
	public abstract void makeStory();
	public abstract void makeGraphics();
	public Game getGame()
	{
		return g;
	}
	
}
