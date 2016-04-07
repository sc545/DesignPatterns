package actionadventuregame;

public class Troll extends Character {
	public Troll(){
		weapon = new AxeBehavior();
	}
	public void fight(){
		System.out.println("트롤 선택");
	}
}
