package ex;

public class Station {

	public static void main(String[] args) {
		CurrentData cd = new CurrentData();
		Ob1 ob1 = new Ob1(cd);
		Ob2 ob2 = new Ob2(cd);
		Ob3 ob3 = new Ob3(cd);
		cd.setNum(5);
		cd.delObserver(ob2);
		System.out.println("ob2 ªË¡¶!!");
		cd.setNum(99);
	}

}
