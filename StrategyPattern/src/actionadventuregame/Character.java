package actionadventuregame;

public abstract class Character {
	WeaponBehavior weapon;
	abstract void fight();
	public Character(){
		
	}
	public void checkWeapon(){
		System.out.print("���� ���� : ");weapon.useWeapon();
	}
	public void setWeapon(WeaponBehavior wb){
		weapon = wb;
		System.out.print("���� ��ü :");wb.useWeapon();
	}
}
