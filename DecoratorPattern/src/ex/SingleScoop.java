package ex;

public class SingleScoop extends Scoop{
	Icecream icecream;
	
	public SingleScoop(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public String getDescription() {
		return icecream.getDescription() + ", Single Scoop";
	}
	
	@Override
	public double cost() {
		return 1 + icecream.cost();
	}
}
