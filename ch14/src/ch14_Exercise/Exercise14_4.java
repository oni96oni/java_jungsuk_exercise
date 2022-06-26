package ch14_Exercise;

import java.util.*;
import java.util.stream.*;

class Exercise14_4 {
	public static void main(String[] args) {
		
	}
}
/*
 * [1, 5]
 * [2, 4]
 * [3, 3]
 * [4, 2]
 * [5, 1]
 * 
 * boxed() 메소드는 IntStream 같이 원시 타입에 대한 스트림 지원을 클래스 타입(예: IntStream -> Stream<Integer>)으로 전환하여 전용으로 실행 가능한 (예를 들어 본문과 같이 int 자체로는 Collection에 못 담기 때문에 Integer 클래스로 변환하여 List<Integer> 로 담기 위해 등) 기능을 수행하기 위해 존재합니다.
 * 
 * 	public final Stream<Integer> boxed() {
  		return mapToObj(Integer::valueOf, 0);
	}
 */
