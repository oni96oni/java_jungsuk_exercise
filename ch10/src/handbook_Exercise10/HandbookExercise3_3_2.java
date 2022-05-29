package handbook_Exercise10;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;

public class HandbookExercise3_3_2 {

	public static void main(String[] args) {
		
		//날짜와 시간을 비교할 떄 isAfter(), isBefore(), isEqual()를 사용
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.now();
		
		int result = date1.compareTo(date2); //같으면 0, date1이 이전이면 -1, 이후면 1
		System.out.println(result);
		
		LocalDate kDate = LocalDate.of(1996, 8, 4);
		JapaneseDate jDate = JapaneseDate.of(1996, 8, 4);
		
		System.out.println(kDate.equals(jDate));
		System.out.println(kDate.isEqual(jDate));
	}
}