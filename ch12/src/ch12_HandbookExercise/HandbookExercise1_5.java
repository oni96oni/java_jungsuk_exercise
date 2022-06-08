package ch12_HandbookExercise;

import java.util.ArrayList;

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	ArrayList<T> getList() {
		return list;
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

public class HandbookExercise1_5 {
	public static void main(String args[]) {
		Box<Apple> appleBox1 = new Box<Apple>();
		Box<Apple> appleBox2 = new Box<Grape>();
		Box<Fruit> appleBox3 = new Box<Apple>();
		
		Box<Apple> appleBox4 = new FruitBox<Apple>();
		Box<Apple> appleBox5 = new Box<>();
		
		Box<Apple> appleBox6 = new Box<Apple>();
		appleBox6.add(new Apple());
		appleBox6.add(new Grape());
		
		Box box = null;
		Box<Object> objBox = null;
		
		box = (Box)objBox;
		objBox = (Box<Object>)box;
				
		Box<? extends Object> wBox = new Box<String>();
		
		FruitBox<? extends Fruit> box2 = null;
		FruitBox<Apple> appleBox = (FruitBox<Apple>)box2; // 미확인 타입으로 형변환 경고
		
	}
}

class Apple extends Fruit {}
class Grape extends Fruit {}
class Fruit {}
class appleBox<T> extends FruitBox<T> {}
class grapeBox<T> extends FruitBox<T> {}
class FruitBox<T> extends Box<T> {}