package ch14_HandbookExercise;

import java.util.function.IntSupplier;

public class HandbookExercise1_4 {

	public static void main(String[] args) {
		IntSupplier s = () -> (int)(Math.random() * 100) + 1 ;
		
	}
	
	static void makeRandomList (IntSupplier s, int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.getAsInt();
		}
	}
}
