package ch14_HandbookExercise;

import java.util.function.Predicate;

public class HandbookExercise1_6 {

	public static void main(String[] args) {
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		
		Predicate<Integer> notP = p.negate();
		Predicate<Integer> all = notP.and(q).or(r);
		Predicate<Integer> all2 = notP.and(q.or(r));
		
		System.out.println(all.test(2));
		System.out.println(all2.test(2));
	}
}