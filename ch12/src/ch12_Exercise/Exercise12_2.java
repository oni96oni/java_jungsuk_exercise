package ch12_Exercise;

public class Exercise12_2 {

	public static void main(String[] args) {
		
//		오류없이 올바르게 호출한 문장을 찾으시오 그리고 그 이유는?
//		Juicer.<Apple>makeJuice(new FruitBox<Fruit>());
//		Juicer.<Fruit>makeJuice(new FruitBox<Grape>());
//		Juicer.<Fruit>makeJuice(new FruitBox<Fruit>());
//		Juicer.makeJuice(new FruitBox<Apple>());
//		Juicer.makeJuice(new FruitBox<Object>());
	}
}

class Juicer{
	static <T extends Fruit> String makeJuice(FruitBox<T> box) {
		String tmp ="";
		for(Fruit f : box.getList())
			tmp += f + " ";
		return tmp;
	}
}

class Apple extends Fruit{}
class Grape extends Fruit{}
class Fruit{}
//Box는 이미 정의되어 있어서 구별을 위해
class Box2{}
class FruitBox<T> extends Box2{
	public Fruit[] getList() {
		return null;
	}
}