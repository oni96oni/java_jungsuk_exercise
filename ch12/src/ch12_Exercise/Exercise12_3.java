package ch12_Exercise;

public class Exercise12_3 {

	public static void main(String[] args) {
//		올바르지 않은 문장을 모두 고르시오 그리고 그 이유는?
//		Box3<?> b1 = new Box3();
//		Box3<?> b2 = new Box3<>();
//		Box3<?> b3 = new Box3<Object>();
//		Box3<Object> b4 = new Box3<Fruit>();
//		Box3 b5 = new Box3<Fruit>();
//		Box3<? extends Fruit> b6 = new Box3<Apple>();
//		Box3<? extends Fruit> b7 = new Box3<? extends Fruit>();
	}

}

//Box는 이미 정의되어 있어서 구별을 위해 
class Box3<T extends Fruit> {
	T item;
	
	void setItme(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
}