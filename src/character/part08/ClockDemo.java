package character.part08;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 关于日期的一些新特性
 * @author Derlin
 *
 */
public class ClockDemo {
	
	public static void main(String[] args) {
		// Clock对失去敏感
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);
		System.out.println(millis);
		System.out.println(legacyDate);
		
		// 获取所有时区
		System.out.println(ZoneId.getAvailableZoneIds());
		// 获取所属时区，上海为东八区
		ZoneId shanghaizone = ZoneId.of("Asia/Shanghai");
		ZoneId berlinzone = ZoneId.of("Europe/Berlin");
		System.out.println(shanghaizone.getRules());
		System.out.println(berlinzone.getRules());
		
		// 本地时间，没有时区信息，所以上海的时间要在柏林的时间后
		LocalTime shanghainow = LocalTime.now(shanghaizone);
		LocalTime berlinnow = LocalTime.now(berlinzone);
		System.out.println(shanghainow);
		System.out.println(berlinnow);
		System.out.println(shanghainow.isBefore(berlinnow));
		long hoursBetween = ChronoUnit.HOURS.between(shanghainow, berlinnow);
		long minBetween = ChronoUnit.MINUTES.between(shanghainow, berlinnow);
		System.out.println(hoursBetween);
		System.out.println(minBetween);
		
		// 本地日期
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		System.out.println(today);
		System.out.println(tomorrow);
		
		
		
		
		
		
	}
	
}
