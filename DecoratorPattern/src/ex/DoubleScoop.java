package ex;

public class DoubleScoop extends Scoop{
	Icecream icecream;
	
	public DoubleScoop(Icecream icecream) {
		this.icecream = icecream;
	}
	
	@Override
	public String getDescription() {
		return icecream.getDescription() + ", Double Scoop";
	}
	
	@Override
	public double cost() {
		return 2 + icecream.cost();
	}
}
