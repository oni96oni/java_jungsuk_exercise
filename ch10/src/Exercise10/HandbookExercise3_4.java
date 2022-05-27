package Exercise10;

import java.time.Instant;

public class HandbookExercise3_4 {

	public static void main(String[] args) {
		Instant now = Instant.now();
		Instant now2 = Instant.ofEpochSecond(now.getEpochSecond());
		Instant now3 = Instant.ofEpochSecond(now.getEpochSecond(), now.getNano());
		
		System.out.println(now);
		System.out.println(now2);
		System.out.println(now3);
	}
}