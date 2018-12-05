package Methods;

import java.time.LocalDateTime;

public class DateTimeAPI {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub


		final LocalDateTime now = LocalDateTime.now();
		now.plusYears(1);
		final LocalDateTime tomorrow = now.plusHours(24).plusMinutes(10);

		if(now.isEqual(tomorrow))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		System.out.println("Today Now"+now);

		System.out.println("Tomoro with 10 minutes addition"+tomorrow);

		final LocalDateTime midnight = now.withHour( 0 ).withMinute( 0 ).withSecond( 0 ).withNano( 0 );

		System.out.println("Midite Time"+midnight);
	}

}
