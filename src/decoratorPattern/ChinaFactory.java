package decoratorPattern;

public class ChinaFactory extends iphoneMake {

	public ChinaFactory(Iphone t) {
		super(t);
		addAdditional();
	}

	@Override
	public void addAdditional() {
		p.manufacturingSite = "China";
	}
	
}
