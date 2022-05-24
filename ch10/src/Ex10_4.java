import java.util.*;

class Ex10_4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(1996, 7, 4);	// 1996년 8월 4일

		System.out.println(toString(date));
		System.out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));

		System.out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date));

		System.out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31); //roll은 add와 비슷하지만 다르다! 다른 필드에 영향을 미치지않아. 즉 여기서는 월에 영향끼치지 않음
		System.out.println(toString(date));

		System.out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date));
	}

	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1) 
                   +"월 " + date.get(Calendar.DATE) + "일";
	}
	//또한 date날짜에 변화를 주었으면 그걸로 저장된다. 그때그때만 반영되는것이 아니라 쭉가는것임.
}