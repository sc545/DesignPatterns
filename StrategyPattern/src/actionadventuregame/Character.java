package actionadventuregame;

public abstract class Character {
	WeaponBehavior weapon;
	abstract void fight();
	public Character(){
		
	}
	public void checkWeapon(){
		System.out.print("현재 무기 : ");weapon.useWeapon();
	}
	public void setWeapon(WeaponBehavior wb){
		weapon = wb;
		System.out.print("무기 교체 :");wb.useWeapon();
	}
}
