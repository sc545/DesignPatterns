package actionadventuregame;

public class GameSimulator {

	public static void main(String[] args) {
		Character c1 = new Knight();
		c1.checkWeapon();
		c1.fight();
		c1.setWeapon(new AxeBehavior());
		c1.checkWeapon();
		
		Character myCharacter = new Queen();
		myCharacter.checkWeapon();
	}

}
