package ex;

public class Gelato extends Icecream {
	public Gelato() {
		description = "Gelato";
	}
	@Override
	public double cost() {
		return 4.5;
	}
}
