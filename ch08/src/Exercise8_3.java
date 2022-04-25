
public class Exercise8_3 {

	public static void main(String[] args) {
		//오버라이딩의 조건중에서 예외의 개수에대한 이해 개수가중요한게 아니라 범위가 중요한것!
		class NumberException extends Exception {}
		class InvalidNumberException extends NumberException {}
		class NotANumberException extends NumberException {}
		class Parent {
			int a;
			int b;
			Parent() {
				this(0,0);
			}
			Parent(int a, int b) {
				this.a = a;
				this.b = b;
			}
			void add(int a, int b)
					throws InvalidNumberException, NotANumberException {}
		}
		class Child extends Parent {
			Child() {}
			Child(int a, int b) {
				super(a,b);
			}
			void add(int a, int b)
					throws InvalidNumberException, NotANumberException {}
		}
	}

}
