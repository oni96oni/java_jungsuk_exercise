import java.util.Objects;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	public int hashCode() {
		return Objects.hash(kind, number); // 가변인자라서 호출시 지정하는 값의 개수가 정해져있지 않다.
	}
	//가변인자란 매개변수개수가 정해지지않은것!
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) && this.number == c.number;
	}
	
	public String toString() {
		return "kind :"+kind+", number:"+number;
	}
	
}

class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.equals(c2));
		System.out.println();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}