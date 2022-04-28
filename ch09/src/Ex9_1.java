class Ex9_1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	} // main
} 

class Value {
	int value;

	Value(int value) {
		this.value = value;
	}
// equals는 두 객체의 같고 다름을 참조변수의 값으로 판단합니다 그렇기 때문에 서로 다른 두 객체를 equals메서드로 비교하면 항상 false를 결과로 얻게 됩니다.
//	public boolean equals(Object obj) {
//		if(!(obj instanceof Value)) 
//			return false;
//		Value v = (Value)obj;
//		
//		return this.value == v.value;
//		
//	}
}