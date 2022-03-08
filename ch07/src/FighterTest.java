abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("����ϴ�.");}
}

interface Fightable {
	void move(int x, int y); // public abstract�� ����
	void attack(Fightable f); // public abstract�� ����
}

class Fighter extends Unit2 implements Fightable {
	//�������̵��Ҷ� ��Ģ ���󺸴� ���������ڰ� ������ �ȵȴ�!
	public void move(int x, int y) { //���⼭ �Ⱦ��� ����Ʈ�� ���������ڷ� �ǹǷ� �� �������� �ȵȴ�.
		System.out.println("["+x+","+y+"]�� �̵�"); // public abstract�� ����
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");
	}; // public abstract�� ����
	
	//�ο���ִ� ��븦 �ҷ��´�.
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
//		u.attack(new Fighter()); //Unit2���� attack()�� ��� ȣ��Ұ�
		u.stop();
		
		f3.move(100, 200);
		f3.attack(new Fighter());
//		f3.stop(); //Fightable���� stop()�� ��� ȣ��Ұ�
//		�������̽��� �����̱��ϳ� ������ ���ϸ� ���� �ٸ� ����!
	}

}
