class Product {
	int price;			// 제품의 가격
	int bonusPoint;	// 제품 구매시 제공하는 보너스 점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스 점수는 제품의 가격의 10%
	} 
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다 -> super사용
		super(100);		// Tv의 가격은 100으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩 한다.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Buyer {	// 고객, 물건을 사는사람
	int money = 1000;	  // 보유한 금액
	int bonusPoint = 0; // 보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;            // money에서 구매한 제품의 가격만큼 빼준다.
		bonusPoint += p.bonusPoint;  // 제품의 10%에 해당하는 보너스점수를 추가한다.
		System.out.println(p.toString() + "을/를 구입하셨습니다."); //구매한 제품을 구매했다는 출력
//		System.out.println(p + "을/를 구입하셨습니다.");  위와 동일하다 왜냐하면 참조변수+문자열은 참조변수.toString()+문자열로 처리되기 때문이다.

	}
}

class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		
		Product p = new Tv1();
		b.buy(p); //252p 참고자료를 구현
		b.buy(new Tv1()); 
		b.buy(new Computer()); 

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}
}