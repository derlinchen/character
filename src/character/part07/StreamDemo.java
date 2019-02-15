package character.part07;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// stream���÷�����Ϊһ���б�
		List<String> strings = Arrays.asList("11","22","33","44");
		// forEach�÷�
		strings.stream().forEach(System.out::println);
		
		// map���÷�
		List<Integer> nums = Arrays.asList(1,2,3,4);
		List<Integer> mapnums = nums.stream().map(i->i*i).distinct().collect(Collectors.toList());
		for (Integer integer : mapnums) {
			System.out.println(integer);
		}
		
		// filter���÷�
		List<String> filterstrings = Arrays.asList("AA","","BB","CC");
		System.out.println(filterstrings.stream().filter(string->!string.isEmpty()).count());
		
		// limit���÷�
		nums.stream().limit(2).forEach(System.out::println);
		
		// sort���÷�
		nums.stream().sorted().forEach(System.out::println);
		
		// ���Ĳ��д���
		System.out.println(filterstrings.parallelStream().filter(string->string.isEmpty()).count());
		
		// ����ͳ��
		IntSummaryStatistics stat = nums.stream().mapToInt(x->x).summaryStatistics();
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
		System.out.println(nums.stream().count());
		
		// math���÷�
		boolean ismath = strings.stream().anyMatch((s)->s.startsWith("11"));
		System.out.println(ismath);
		
		// reduce�÷�
		Optional<String> red = strings.stream().reduce((s1, s2)->s1 + "#" +s2);
		red.ifPresent(System.out::println);
	}

}
