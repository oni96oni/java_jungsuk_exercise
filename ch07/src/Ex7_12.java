class Ex7_12 { 
	class InstanceInner { 
		int iv = 100; 
//		static int cv = 100;            // 에러! static변수를 선언할 수 없다. static 클래스만 가능! static 멤버는 객체 생성없이 사용가능 해야 하는데 인스턴스, 지역 클래스 안에 있는 static멤버의 경우는 객체가 생성되어야지 사용할 수 있으므로 불가하다.
		final static int CONST = 100;   // final static은 상수이므로 허용
	} 

   static class StaticInner { 
		int iv = 200; 
		static int cv = 200;    // static클래스만 static멤버를 정의 할 수 있다.
	} 

	void myMethod() { 
		class LocalInner { 
			int iv = 300; 
//			static int cv = 300;             // 에러! static변수를 선언할 수 없다.
			final static int CONST = 300;    // final static은 상수이므로 허용
		} 
		
		int i = LocalInner.CONST; //OK 
		System.out.println(i);
	} 

	public static void main(String args[]) { 
		System.out.println(InstanceInner.CONST); 
		System.out.println(StaticInner.cv); 
//		System.out.println(LocalInner.Const); NO
		
	} 
}