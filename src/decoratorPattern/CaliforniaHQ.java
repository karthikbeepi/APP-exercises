package decoratorPattern;

public class CaliforniaHQ extends iphoneMake{

	public CaliforniaHQ(Iphone t) {
		super(t);
		addAdditional();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addAdditional() {
		
		p.designSite = "California";
		
	}

	
	
}
