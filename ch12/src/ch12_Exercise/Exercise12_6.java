package ch12_Exercise;

public class Exercise12_6 {}
// 이 애너테이션이 올바르게 적용 되지 않은것은? 그리고 그 이유는?
//@TestInfo
//class Exercise12_6_1 {}
//@TestInfo(1)
//class Exercise12_6_2 {}
//@TestInfo("bbb")
//class Exercise12_6_3 {}
//@TestInfo("bbb","ccc")
//class Exercise12_6_4 {}

@interface TestInfo {
	int count() default 1;
	String[] value() default "aaa";
}