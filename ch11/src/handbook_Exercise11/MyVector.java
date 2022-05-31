package handbook_Exercise11;

public class MyVector {
	//객체를 저장할 객체배열(objArr)과 크기(size)를 저장할 변수를 선언
	Object[] objArr;
	int size;
	
	
	//생성자 MyVector(int capacity)와 기본 생성자 MyVector()를 선언
	MyVector() {}
	
	MyVector(int capacity) {
		this.size = capacity;
	}
	
	
	int size() { // 컬렉션의 크기(size, 객체배열에 저장된 객체의 개수)를 반환
		return objArr.length;
	}
	
	int capacity() { // 컬렉션의 용량(capacity, 객체배열의 길이)을 반환
		return size;
	}
	
	boolean isEmpty() { // 컬렉션이 비어있는지 확인
		if(this.size()==0) {
			return true;
		}
		return false;
	}
	
	void clear() { // 컬렉션의 객체를 모두 제거(객체배열의 모든 요소를 null로)
		for(int i=0; i<this.size(); i++) {
			objArr[i] = null;
		}
	}
	
	Object get(int index) { // 컬렉션에서 지정된 index에 저장된 객체를 반환
		return objArr[index];
	}
	
	int indexOf(Object obj) { // 지정된 객체의 index를 반환(못찾으면 -1)
		for(int i=0; i<this.size(); i++) {
			if(objArr[i].equals(obj))
			return i;
		}
		return -1;
	}
	
	void setCapacity(int minCapacity) { //컬렉션의 용량을 변경
		this.size = minCapacity;
	}
	
	Object remove(int index) { // 컬렉션에서 객체를 삭제
		System.arraycopy(objArr, index, objArr, index-1, index-1);
		objArr[size-1] = null;
		size--;
		return objArr;
	}
	
	boolean add(Object obj) { // 컬렉션에 객체를 추가
		if(obj instanceof MyVector) {
			if(this.size() < size) {
				objArr[size] = obj;
				return true;
			}
			return false;
		}
		return false;
	}
}