import java.util.*; 

class Ex11_8 { 
	public static void main(String[] args) { 
		Integer[] arr = { 30, 50, 10, 40, 20 }; 

		Arrays.sort(arr); // Integer가 가지고 있는 기본 정렬 기준 compareTo()로 정렬
		System.out.println(Arrays.toString(arr));

		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp()); // DescComp�뿉 援ы쁽�맂 �젙�젹 湲곗��쑝濡� �젙�젹
		System.out.println(Arrays.toString(arr));
	} // main
}	

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer))
			return -1; // Integer媛� �븘�땲硫�, 鍮꾧탳�븯吏� �븡怨� -1 諛섑솚

		Integer i  = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		// return i2 - i; �삉�뒗 return i2.compareTo(i);�룄 媛��뒫
		return i.compareTo(i2) * -1; // 湲곕낯 �젙�젹�씤 compareTo()�쓽 �뿭�닚�쑝濡� �젙�젹
	}
}
