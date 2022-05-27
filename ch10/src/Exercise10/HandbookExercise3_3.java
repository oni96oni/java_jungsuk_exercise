package Exercise10;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HandbookExercise3_3 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime now = LocalTime.now();
		System.out.println(today);
		System.out.println(now);
	
		LocalDate birthdayDate = LocalDate.of(1996, 8, 4);
		LocalTime birthdayTime = LocalTime.of(23, 59, 59);
		System.out.println(birthdayDate);
		System.out.println(birthdayTime);
		
		LocalDate birthdayDate2 = LocalDate.ofYearDay(1996, 217);
		LocalTime birthdayTime2 = LocalTime.ofSecondOfDay(86399);
		System.out.println(birthdayDate2);
		System.out.println(birthdayTime2);
		
		LocalDate birthdayDate3 = LocalDate.parse("1996-08-04");
		LocalTime birthdayTime3 = LocalTime.parse("23:59:59");
		System.out.println(birthdayDate3);
		System.out.println(birthdayTime3);
		
		//java.time 패키지의 핵심! LocalDate와 LocalTime
		//now()는 현재 날짜 시간을, of()는 특정 날짜 시간을 지정할 때 사용한다.
		
	}
}