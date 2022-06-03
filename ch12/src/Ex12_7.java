class Parent {
	void parentMethod() { }
}

class Child extends Parent {
	@Override //이 애너테이션이 없으면 오류를 찾기 힘듬!
	void parentmethod() { } // 조상 메서드의 이름을 잘못 적었음. 
}