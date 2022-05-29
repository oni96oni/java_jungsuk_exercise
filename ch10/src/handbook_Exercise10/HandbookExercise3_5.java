package handbook_Exercise10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class HandbookExercise3_5 {
	public static void main(String[] args) {
		//LocalDateTime은 LocalDate와 LocalTime을 합쳐놓은 것
		//ZonedDateTime은 LocalDateTime에 시간대(time zone)를 추가한 것
		LocalDateTime dateTime = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
		LocalDateTime today = LocalDateTime.now();
		
		//now(), of()로 LocalDateTime만들기, 다양한 종류의 of()가 있음.
		LocalDate date = LocalDate.of(2015, 12, 31);
		LocalTime time = LocalTime.now();
		
		//LocalDate와 LocalTime으로 LocalDateTime만들기
		LocalDateTime dt = LocalDateTime.of(date, time);
		LocalDateTime dt2 = date.atTime(time);
		LocalDateTime dt3 = time.atDate(date);
		LocalDateTime dt4 = date.atTime(12, 34, 56);
		LocalDateTime dt5 = time.atDate(LocalDate.of(2015, 12, 31));
		LocalDateTime dt6 = date.atStartOfDay();
		LocalDateTime dt7 = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
		
		
		System.out.println(dt);
		System.out.println(dt2);
		System.out.println(dt3);
		System.out.println(dt4);
		System.out.println(dt5);
		System.out.println(dt6);
		System.out.println(dt7);
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dateTime.atZone(zid);
		System.out.println(zdt);		
	}
}