package actionadventuregame;

public class Knight extends Character {
	public Knight(){
		weapon = new SwordBehavior();
	}
	public void fight(){
		System.out.println("����� ����");
	}
}