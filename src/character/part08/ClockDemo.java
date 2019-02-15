package character.part08;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * �������ڵ�һЩ������
 * @author Derlin
 *
 */
public class ClockDemo {
	
	public static void main(String[] args) {
		// Clock��ʧȥ����
		Clock clock = Clock.systemDefaultZone();
		long millis = clock.millis();
		Instant instant = clock.instant();
		Date legacyDate = Date.from(instant);
		System.out.println(millis);
		System.out.println(legacyDate);
		
		// ��ȡ����ʱ��
		System.out.println(ZoneId.getAvailableZoneIds());
		// ��ȡ����ʱ�����Ϻ�Ϊ������
		ZoneId shanghaizone = ZoneId.of("Asia/Shanghai");
		ZoneId berlinzone = ZoneId.of("Europe/Berlin");
		System.out.println(shanghaizone.getRules());
		System.out.println(berlinzone.getRules());
		
		// ����ʱ�䣬û��ʱ����Ϣ�������Ϻ���ʱ��Ҫ�ڰ��ֵ�ʱ���
		LocalTime shanghainow = LocalTime.now(shanghaizone);
		LocalTime berlinnow = LocalTime.now(berlinzone);
		System.out.println(shanghainow);
		System.out.println(berlinnow);
		System.out.println(shanghainow.isBefore(berlinnow));
		long hoursBetween = ChronoUnit.HOURS.between(shanghainow, berlinnow);
		long minBetween = ChronoUnit.MINUTES.between(shanghainow, berlinnow);
		System.out.println(hoursBetween);
		System.out.println(minBetween);
		
		// ��������
		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
		System.out.println(today);
		System.out.println(tomorrow);
		
		
		
		
		
		
	}
	
}
