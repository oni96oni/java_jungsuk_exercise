package ch14_Exercise;

public class Exercise14_1 {
	public static void main(String[] args) {
		
	}
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	//
	
	void printVar(String name, int i) {
		System.out.println(name+"="+i);
	}
	//
	
	int square(int x) {
		return x * x;
	}
	//
	
	int roll() {
		return (int)(Math.random() * 6);
	}
	//
	
	int sumArr(int[] arr) {
		int sum =0;
		for(int i : arr)
			sum += i;
		return sum;
	}
	//
	 
	int[] emptyArr() {
		return new int[] {};
	}
	//
	
}


