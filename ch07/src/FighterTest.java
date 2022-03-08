abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable {
	void move(int x, int y); // public abstract가 생략
	void attack(Fightable f); // public abstract가 생략
}

class Fighter extends Unit2 implements Fightable {
	//오버라이딩할때 규칙 조상보다 접근제어자가 좁으면 안된다!
	public void move(int x, int y) { //여기서 안쓰면 디폴트가 접근제어자로 되므로 더 좁아져서 안된다.
		System.out.println("["+x+","+y+"]로 이동"); // public abstract가 생략
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}; // public abstract가 생략
	
	//싸울수있는 상대를 불러온다.
	Fightable getFightable(){
		Fightable f = new Fighter();
		return (Fightable)f;
		
	}
}
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();
//		Fighter f = new Fighter();
		Unit2 u = new Fighter(); 
		Fightable f3 = new Fighter();
		u.move(100, 200);
//		u.attack(new Fighter()); //Unit2에는 attack()이 없어서 호출불가
		u.stop();
		
		f3.move(100, 200);
		f3.attack(new Fighter());
//		f3.stop(); //Fightable에는 stop()이 없어서 호출불가
//		인터페이스도 조상이긴하나 엄밀히 말하면 조금 다른 조상!
	}

}
