package ex;

public class Broadcast extends Station {
	public Broadcast() {
		ws = new Sunny();
	}
	public void broadcast(){
		System.out.println("방송중입니다.");
	}

}
