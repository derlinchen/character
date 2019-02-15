package character.part07;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// stream的用法必须为一个列表
		List<String> strings = Arrays.asList("11","22","33","44");
		// forEach用法
		strings.stream().forEach(System.out::println);
		
		// map的用法
		List<Integer> nums = Arrays.asList(1,2,3,4);
		List<Integer> mapnums = nums.stream().map(i->i*i).distinct().collect(Collectors.toList());
		for (Integer integer : mapnums) {
			System.out.println(integer);
		}
		
		// filter的用法
		List<String> filterstrings = Arrays.asList("AA","","BB","CC");
		System.out.println(filterstrings.stream().filter(string->!string.isEmpty()).count());
		
		// limit的用法
		nums.stream().limit(2).forEach(System.out::println);
		
		// sort的用法
		nums.stream().sorted().forEach(System.out::println);
		
		// 流的并行处理
		System.out.println(filterstrings.parallelStream().filter(string->string.isEmpty()).count());
		
		// 数据统计
		IntSummaryStatistics stat = nums.stream().mapToInt(x->x).summaryStatistics();
		System.out.println(stat.getMax());
		System.out.println(stat.getMin());
		System.out.println(stat.getSum());
		System.out.println(stat.getAverage());
		System.out.println(nums.stream().count());
		
		// math的用法
		boolean ismath = strings.stream().anyMatch((s)->s.startsWith("11"));
		System.out.println(ismath);
		
		// reduce用法
		Optional<String> red = strings.stream().reduce((s1, s2)->s1 + "#" +s2);
		red.ifPresent(System.out::println);
	}

}
