package Exercise10;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HandbookExercise3_2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
//		LocalDate tomorrow = today.plusDays(1); 위의 문장과 동일
		System.out.println(tomorrow);
		
		LocalTime now = LocalTime.now();
		int minute = now.getMinute();
//		int minute = now.get(ChronoField.MINUTE_OF_HOUR);
		System.out.println(minute);
		
	}
}