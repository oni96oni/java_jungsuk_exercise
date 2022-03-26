class Car {
	String color;		
	String gearType;	
	int door;			

	Car() {}

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

class Ex6_12 {
	public static void main(String[] args) {
		Car c1 = new Car(); //c1 인스턴스는 매개변수가 없는 생성자를 이용하여 생성한 뒤 직접 초기화
		c1.color    = "white";
		c1.gearType = "auto";
		c1.door = 4;

		Car c2 = new Car("white", "auto", 4); //c2 인스턴스는 매개변수가 있는 생성자를 이용하여 초기화

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}