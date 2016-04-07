package ex;

public class IceStore {

	public static void main(String[] args) {
		Icecream i1 = new Gelato();
		System.out.println(i1.getDescription()+" $"+i1.cost());
		Icecream i2 = new Gelato();
		i2 = new SingleScoop(i2);
		System.out.println(i2.getDescription()+" $"+i2.cost());
		Icecream i3 = new ShootingStar();
		i3 = new DoubleScoop(i3);
		System.out.println(i3.getDescription()+" $"+i3.cost());
		Icecream i4 = new ShootingStar();
		System.out.println(i4.getDescription()+" $"+i4.cost());
		i4 = new DoubleScoop(i4);i4 = new DoubleScoop(i4);i4 = new DoubleScoop(i4);i4 = new DoubleScoop(i4);
		System.out.println(i4.getDescription()+" $"+i4.cost());
	}

}
