
class Product22{
	int price;
	int bonusPoint;
	
	Product22(int price) {
		this.price = price;
		bonusPoint = (int)(price/10);
	}
}

class Tv22 extends Product22 {
	
	Tv22(){}
	
	public String toString() {
		return "Tv";
	}
}

public class Exercise7_3 {

	public static void main(String[] args) {
		Tv22 tv = new Tv22();
	}

}
