package handbook_Exercise10;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class HandbookExercise3_9 {
	public static void main(String[] args) {
		//두 날짜의 차이 구하기
		LocalDate date1 = LocalDate.of(2014, 1, 1);
		LocalDate date2 = LocalDate.of(2015, 12, 31);
		
		Period pe = Period.between(date1, date2);
		System.out.println(pe.toString());
		
		//두 시간의 차이 구하기
		LocalTime time1 = LocalTime.of(00, 00, 00);
		LocalTime time2 = LocalTime.of(12, 34, 56);
		
		Duration du = Duration.between(time1, time2);
		System.out.println(du.toString());
		
		//특정 필드의 값을 얻을 때는 get()을 사용
		long year = pe.get(ChronoUnit.YEARS);
		long month = pe.get(ChronoUnit.MONTHS);
		long day = pe.get(ChronoUnit.DAYS);
		
		long sec = du.get(ChronoUnit.SECONDS);
		long nano = du.get(ChronoUnit.NANOS);

		System.out.println(year);
		System.out.println();
		System.out.println(pe.getUnits());
		System.out.println(du.getUnits());
		
		//시분초를 구할 때는 Duration을 LocalTime으로 변환하는 것이 편리
		LocalTime tmpTime = LocalTime.of(0, 0).plusSeconds(du.getSeconds());
		
		int hour = tmpTime.getHour();
		int min = tmpTime.getMinute();
		int seco = tmpTime.getSecond();
		int nanos = du.getNano();
				
	}
}