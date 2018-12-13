package decoratorPattern;

public abstract class  iphoneMake {

	Iphone p;
	public iphoneMake(Iphone t) {
		p = t;
	}
	
	public abstract void addAdditional();
	
}
