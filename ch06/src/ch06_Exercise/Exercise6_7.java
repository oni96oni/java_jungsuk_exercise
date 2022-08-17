package ch06_Exercise;

public class Exercise6_7 {
	int x = 0, y =0; //Marine의 위치좌표(x,y)
	int hp = 60; // 현재 체력
	int weapon = 6; // 공격력
	int armor = 0; // 방어력
	
	void weaponUp() {
	weapon++;	
	}
	
	void armorUp() {
		armor++;
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
