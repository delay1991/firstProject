package co.yedam.api.string;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); // LocalDateTime -> String

		// String -> LocalDateTime
		LocalDateTime anytime = LocalDateTime.parse("20-06-13 15:00:00", dtf);
		dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH");
		anytime = LocalDateTime.parse("15/07/1995 14", dtf);

		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss")));
		
		System.out.println(anytime.getMonthValue()+"월");
		System.out.println(anytime.getMonth());
		
		LocalDateTime ti= LocalDateTime.now().withYear(2020).withMonth(7).withDayOfMonth(5).withHour(15).withMinute(30).withSecond(25);
		
		System.out.println(ti.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		

	}
}
