package ex;

public class Ob3 implements Observer, DisplayElement {
	private CurrentData cd;
	int currentNum;
	public Ob3(CurrentData cd) {
		this.cd = cd;
		cd.addObserver(this);
	}
	@Override
	public void update(int num) {
		currentNum = num;
		display();
	}
	@Override
	public void display() {
		System.out.println("Ob3 현재 숫자는 : "+currentNum);
	}
	
}
